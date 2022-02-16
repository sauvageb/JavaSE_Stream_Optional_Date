package solutions.date;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 ** Consigne **
 *
 * Au sein d'un projet complexe, nous souhaitons récupérer le timestamp actuel du système, basé sur la zone UTC.
 * Nous souhaiterons afficher celui-ci, avec également, le timestamp sans sa zone UTC
 *
 * ASTUCE : Vous devez utiliser la classe Clock
 *
 *************
 *
 * Resultat attendu :
 */
class Exo9 {

    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock.millis());

        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());

    }

}
