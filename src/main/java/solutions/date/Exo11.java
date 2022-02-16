package solutions.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Vous souhaitez partir fin février de l'année prochaine, mais vous avez besoin de savoir si l'année prochaine
 *  est bissextile.
 *
 * Affichez le résultat
 *
 *************
 *
 * Resultat attendu :
 */
class Exo11 {

    public static void main(String[] args) {
        LocalDate departure = LocalDate.now().plusYears(1);

        if (departure.isLeapYear()) {
            System.out.println("L'année " + departure.getYear() + " est bissextile");
        } else {
            System.out.println("L'année " + departure.getYear() + " n'est pas bissextile");
        }
    }
}

