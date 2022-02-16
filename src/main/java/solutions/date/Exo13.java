package solutions.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Convertissez la date du jour en chaine de caractère et affichez la comme : 25/11/2021 10:30:57
 * Puis, reconvertissez cette chaine en date du jour, et affichez la comme : 11-25-2021
 *
 * ASTUCE : Vous devez utiliser le pattern suivant : yyyy/MM/dd HH:mm:ss
 *
 *************
 *
 * Resultat attendu :
 */
class Exo13 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String str = date.format(format);
        System.out.println("Date converted to string :" + str);

        LocalDate date2 = LocalDate.parse(str, format);
        System.out.println("Date type : " + date2);
    }
}

