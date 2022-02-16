package exercices.date;

import java.time.LocalDateTime;

/*
 ** Consigne **
 *
 * 1) Une grande période s'est écoulée depuis la date de sortie de java 8 le 1er mars 2014.
 * Affichez le nombre d'année, de mois et de jours écoulés (avec la classe Period)
 *
 * 2) La date Java 8 se précise avec une date + une heure : le 1er mars 2014 à 19h30 et 50 secondes
 * Affichez le nombre d'année, de mois et jours  ainsi que le nombre total d'heures, minutes et secondes écoulés (avec la classe Duration)
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
        Object date1 = null;

        //      Aujourd'hui
        Object today = null;

//        1)
        int years = 0;
        int months = 0;
        int days = 0;
        System.out.println("il s'est écoulé " + years + " années et " + months + " mois");

//        2)
        //       1er mars 2014 à 19h30 et 50 secondes
        Object date2 = null;
        //      Aujourd'hui avec l'heure
        Object today2 = null;
        long totalSeconds = 0;
        long totalHours = 0;
        System.out.println("il s'est écoulé au total " + totalSeconds + " secondes, ou bien encore, " + totalHours + " heures");

//        3)
        LocalDateTime date3 = null;
        LocalDateTime today3 = null;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        System.out.println("il s'est écoulé " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes");

    }
}

