package solutions.date;

import java.time.LocalDateTime;
import java.util.Date;

/*
 ** Consigne **
 *
 * Coder getTodayWithJava8 pour obtenir la date du jour en Java 8, avec le temps.
 *
 *************
 *
 * Resultat attendu : Date d'aujourd'hui :Thu Nov 25 10:46:20 CET 2021
 */
class Exo1 {

    public static void main(String[] args) {
//        Date today = getToday();
        LocalDateTime today = getTodayWithJava8();
        System.out.println("Date d'aujourd'hui :" + today);
    }

    public static Date getToday() {
        return new Date();
    }

    public static LocalDateTime getTodayWithJava8() {
        return LocalDateTime.now();
    }
}
