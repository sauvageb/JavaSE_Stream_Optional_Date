package solutions.stream;

import java.util.Arrays;

/*
 ** Consigne **
 *
 * Avec les Streams, codez la méthode mapToUppercaseWithStream afin d'avoir
 * le même comportement que mapToUppercase
 *************
 *
 * Resultat attendu : 14
 *
 */
public class Exo2 {

    public static void main(String[] args) {
        long value = getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
        System.out.println(value);
        long value2 = getTotalNumberOfLettersOfNamesLongerThanFiveWithStream("william", "jones", "aaron", "seppe", "frank", "gilliam");
        System.out.println(value2);
    }

    public static long getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        long sum = 0;
        for (String name : names) {
            if (name.length() > 5) {
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) != ' ')
                        sum++;
                }
            }
        }
        return sum;
    }

    public static long getTotalNumberOfLettersOfNamesLongerThanFiveWithStream(String... names) {
        // Version 1
        long total = Arrays.stream(names)
                .filter(totalLetters -> totalLetters.length() > 5)
                .mapToLong(name -> name.chars().count())
                .reduce(0, (a, b) -> Long.sum(a, b));

        // Version 2
        total = Arrays.stream(names)
                .filter(totalLetters -> totalLetters.length() > 5)
                .mapToInt(name -> name.length()).sum();

        // TOP : Version 3
        total = Arrays.stream(names)
                .filter(totalLetters -> totalLetters.length() > 5)
                .flatMap(c -> c.chars().mapToObj(x -> (char) x))
                .filter(c -> !Character.isWhitespace(c))
                .count();

        return total;
    }


}
