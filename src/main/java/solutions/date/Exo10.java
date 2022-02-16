package solutions.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Nous essayons de savoir programmatiquement si une date est avant ou après une autre. Affichez un message pour
 * indiquer les cas.
 *
 * date 1 : aujourd'hui
 * date 2 : 22 02 2022
 *
 *
 * ASTUCE : Vous devez utiliser isAfter ou isBefore
 *
 *************
 *
 * Resultat attendu :
 */
class Exo10 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, 02 ,22);

        if(date2.isBefore(date1)){
            System.out.println("La Date est avant aujourd'hui");
        }else{
            System.out.println("La Date est après aujourd'hui");
        }
    }

}
