package solutions.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Afficher l'année, le mois et le jour de l'année du jour
 *
 *************
 *
 */
class Exo2 {

    public static void main(String[] args) {
        LocalDate today = getToday();
        int year = today.getYear();
        int month = today.getMonth().getValue();
        int day = today.getDayOfMonth();
        System.out.println("année:" + year);
        System.out.println("mois:" + month);
        System.out.println("jour:" + day);
    }

    private static LocalDate getToday() {
        return LocalDate.now();
    }

}
