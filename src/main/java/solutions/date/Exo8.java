package solutions.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 ** Consigne **
 *
 * 1) Vos amis souhaitent vous rencontrer dans une semaine. Quelle sera la date ?
 *
 * 2) Après discussion au téléphone, ils vous disent que la dernière fois qu'ils vous ont vu, c'etait il y a 1 an exactement
 * Quelle était cette date ?
 *
 * ASTUCE : Vous devez utiliser la classe ChronoUnit
 *
 *************
 *
 * Resultat attendu :
 */
class Exo8 {

    public static void main(String[] args) {
        //        1)
        LocalDate today = LocalDate.now();
        System.out.println("La date du jour est : " + today);
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("La date après une semaine est : " + nextWeek);

        //        2)
        LocalDate lastTime = today.minusYears(1);
        System.out.println("La date à laquelle nous nous sommes vu est le  : " + lastTime);
    }

}
