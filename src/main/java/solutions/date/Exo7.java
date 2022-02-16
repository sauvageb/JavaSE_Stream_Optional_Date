package solutions.date;

import java.time.LocalDateTime;

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
        LocalDateTime departure = LocalDateTime.now().plusDays(3).plusHours(5);
        System.out.println("Date et heure exacte du décollage :" + departure);
    }

}
