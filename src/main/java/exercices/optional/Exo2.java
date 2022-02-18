package exercices.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 ** Consigne **
 *
 * Coder findPhoneNumberByNameAndPunishIfNothingFoundWithOptional afin d'avoir
 * le même comportement que findPhoneNumberByNameAndPunishIfNothingFound, mais en retournant des optional.
 *
 * Remarque : Si une valeur est introuvable, Lever une exception IllegalArgumentException,
 * comportant le message suivant : "No phone number found"
 *
 *************
 *
 * Resultat attendu :
 *   No phone number found
 *   Your Solution :
 *   No phone number found
 */
class Exo2 {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616");
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;


    public static void main(String[] args) {
        Exo2 exo2 = new Exo2();
        String nameSearch = "Boris Sauvage";

        // exercices
        try {
            String phoneNumber = exo2.findPhoneNumberByNameAndPunishIfNothingFound(nameSearch);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // solutions
        System.out.println("Your Solution : ");
        try {
            Optional<String> phoneNumberOptional = exo2.findPhoneNumberByNameAndPunishIfNothingFoundWithOptional(nameSearch);
            phoneNumberOptional.get();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    public Optional<String> findPhoneNumberByNameAndPunishIfNothingFoundWithOptional(String name) throws Throwable {
        //TODO
        return null;
    }


    public String findPhoneNumberByNameAndPunishIfNothingFound(String name) {
        for (Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException("No phone number found");
    }


}
