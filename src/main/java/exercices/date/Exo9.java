package exercices.date;

/*
 ** Consigne **
 *
 * Au sein d'un projet complexe, nous souhaitons récupérer le timestamp actuel du système, basé sur la zone UTC.
 * Nous souhaiterons afficher celui-ci, avec également, le timestamp par défault sans sa zone UTC
 *
 * ASTUCE : Vous devez utiliser la classe Clock et Instant
 *
 *************
 *
 * Resultat attendu :
 */
class Exo9 {

    public static void main(String[] args) {
        Object clock = null;
        System.out.println("Timestamp UTC : " + clock);

        Object defaultClock = null;
        System.out.println("Timestamp basé sur la zone du Système : " + defaultClock);
    }

}
