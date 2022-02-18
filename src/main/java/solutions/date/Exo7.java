package solutions.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Votre avion décolle dans 3 jours et 5h. Affichez la date et l'horaire de décollage
 *
 *************
 *
 * Resultat attendu :
 */
class Exo7 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM dd hh:mm:ss z yyyy");
        LocalDateTime departure = LocalDateTime
                .now()
                .plusDays(3).plusHours(5);
        System.out.println("Date et heure exacte du décollage :" + departure.format(formatter));
    }

}
