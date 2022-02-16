package exercices.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 ** Consigne **
 *
 * Coder findPhoneNumberByNameWithOptional et findNameByPhoneNumberWithOptional afin d'avoir
 * le même comportement que findPhoneNumberByName et findNameByPhoneNumber, mais en retournant des optional.
 *
 * Remarque : Si un optional est vide, Si une valeur est introuvable, un optional vide doit être retourné
 *
 *************
 *
 * Resultat attendu :
 *    PhoneNumber is 016/161616 : result searched with name Jos de Vos
 *    Name is Jos de Vos : result searched with PhoneNumber 016/161616
 *    Your Solution :
 *    PhoneNumber is 016/161616 : result searched with name Jos de Vos
 *    Name is Jos de Vos : result searched with PhoneNumber 016/161616
 */
class Exo1 {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616");
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;


    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();
        String nameSearch = "Jos de Vos";
        String phoneSearch = "016/161616";

        // exercices
        String phoneNumber = exo1.findPhoneNumberByName(nameSearch);
        System.out.printf("PhoneNumber is %s : result searched with name %s \n", phoneNumber, nameSearch);
        String name = exo1.findNameByPhoneNumber(phoneSearch);
        System.out.printf("Name is %s : result searched with PhoneNumber %s \n", nameSearch, phoneNumber);

        // solutions
        System.out.println("Your Solution : ");
        Optional<String> phoneNumberOptional = exo1.findPhoneNumberByNameWithOptional(nameSearch);
        System.out.printf("PhoneNumber is %s : result searched with name %s \n", phoneNumberOptional, nameSearch);
        Optional<String> nameOptional = exo1.findPhoneNumberByNameWithOptional(phoneSearch);
        System.out.printf("Name is %s : result searched with PhoneNumber %s \n", nameOptional, phoneSearch);
    }

    public Optional<String> findPhoneNumberByNameWithOptional(String name) {
        //TODO
        return null;
    }

    public Optional<String> findNameByPhoneNumberWithOptional(String phoneNumber) {
        //TODO
        return null;
    }

    public String findPhoneNumberByName(String name) {
        for (Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public String findNameByPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }


}
