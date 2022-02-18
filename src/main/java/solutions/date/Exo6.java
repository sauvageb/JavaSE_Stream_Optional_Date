package solutions.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Coder le main pour obtenir l'heure complete du jour, sans la date du jour
 *
 *************
 *
 * Resultat attendu : Heure actuelle sans la date : 10:46:20
 */
class Exo6 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("HH:mm:ss");
        System.out.println("Heure actuelle sans la date : " + time.format(formatter));
    }

}
