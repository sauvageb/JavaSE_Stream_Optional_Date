package exercices.stream;

import java.util.ArrayList;
import java.util.Collection;

/*
 ** Consigne **
 *
 * Avec les Streams, codez la méthode mapToUppercaseWithStream afin d'avoir
 * le même comportement que mapToUppercase
 *************
 *
 * Resultat attendu : [AARON, FRANK, WILLIAM, GILLIAM]
 */
class Exo1 {

    public static void main(String[] args) {
        Collection<String> result = mapToUppercase("aaron", "frank", "william", "gilliam");
        System.out.println(result);
    }

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUppercaseWithStream(String... names) {
        // TODO
        return new ArrayList<>();
    }

}
