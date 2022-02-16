package exercices.stream;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez transformWithStream pour aplatir cette collection multidimensionnelle
 * Elle devra avoir le même comportement que transform
 *
 *************
 *
 * Resultat attendu : [Viktor, Farcic, John, Doe, Third]
 *
 */
public class Exo3 {

    public static void main(String[] args) {
        List<List<String>> list = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> result = transform(list);
        System.out.println(result);
    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    // TODO
    public static List<String> transformWithStream(List<List<String>> collection) {
        return null;
    }


}
