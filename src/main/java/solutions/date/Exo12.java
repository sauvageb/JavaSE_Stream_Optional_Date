package solutions.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;


/*
 ** Consigne **
 *
 * 1) Une grande période s'est écoulée depuis la date de sortie de java 8 le 1er mars 2014.
 * Affichez le nombre d'année, de mois et de jours écoulés (avec la classe Period)
 *
 * 2) La date Java 8 se précise avec une date + une heure : le 1er mars 2014 à 19h30 et 50 secondes
 * Affichez le nombre d'années, de mois et jours  ainsi que le nombre total d'heures, minutes et secondes écoulés (avec la classe Duration)
 *
 * 3) : Vous pourrez utilisez ChronoUnit pour obtenir les données d'heures et de secondes par exemple
 *
 *************
 *
 * Resultat attendu :
 */
class Exo12 {

    public static void main(String[] args) {
        //       1er mars 2014
        LocalDate date1 = LocalDate.of(2014, 03, 01);
        //      Aujourd'hui
        LocalDate today = LocalDate.now();

//        1)
        Period period = Period.between(date1, today);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("il s'est écoulé " + years + " années, " + months + " mois et " + days + " jours");

        //        2)
        LocalDateTime date2 = date1.atTime(19, 30, 50);
        LocalDateTime today2 = LocalDateTime.now();
        Duration duration = Duration.between(date2, today2);
        long totalSeconds = duration.getSeconds();
        long totalHours = duration.toHours();

        System.out.println("il s'est écoulé au total " + totalSeconds + " secondes, ou bien encore, " + totalHours + " heures");

//        3)
        LocalDateTime date3 = date1.atTime(19, 30, 50);
        LocalDateTime today3 = LocalDateTime.now();
        long hours = ChronoUnit.HOURS.between(date3, today3);
        long minutes = ChronoUnit.MINUTES.between(date3.plusHours(hours), today3);
        long seconds = ChronoUnit.SECONDS.between(date3.plusHours(hours).plusMinutes(minutes), today3);

        System.out.println("il s'est écoulé " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes");
    }
}

