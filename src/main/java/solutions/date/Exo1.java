package solutions.date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

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
        ZonedDateTime today = getTodayWithJava8();
        System.out.println("Date d'aujourd'hui :" + today);
    }

    public static Date getToday() {
        return new Date();
    }

    public static ZonedDateTime getTodayWithJava8() {
        ZonedDateTime today = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("E MMM dd hh:mm:ss z YYYY")
                .withLocale(Locale.ENGLISH);

        System.out.println(today.format(formatter));
        return today;
    }
}
