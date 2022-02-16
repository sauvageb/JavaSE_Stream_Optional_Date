package solutions.date;

import java.time.LocalDate;
import java.time.MonthDay;

/*
 ** Consigne **
 *
 * Vérifier si la date de l'événement périodique est arrivé
 * Date 1 : la date de votre anniversaire
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si c'est votre anniversaire ou non.
 *
 * ASTUCE : Vous pouvez utiliser L'objet MonthDay
 *
 *************
 *
 * Resultat attendu :
 */
class Exo5 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1992, 01, 30);
        LocalDate today = LocalDate.now();

        MonthDay birthday = MonthDay.of(date1.getMonth(), date1.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);

        if (currentMonthDay.equals(birthday)) {
            System.out.println("C'est votre anniversaire");
        } else {
            System.out.println("Votre anniversaire n'est pas encore arrivé");
        }
    }
}
