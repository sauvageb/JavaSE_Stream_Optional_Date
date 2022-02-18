package solutions.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Evaluez si deux dates sont égales
 * Date 1 : la date du premier jour de votre formation Java 8
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si elles sont égales ou non
 *
 *************
 *
 * Resultat attendu :
 */
class Exo4 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2021, 12, 13);
        LocalDate date2 = LocalDate.now();

        if (date1.isEqual(date2)) {
            System.out.println("Les deux dates sont identiques");
        } else {
            System.out.println("Les dates sont différentes");
        }
    }


}
