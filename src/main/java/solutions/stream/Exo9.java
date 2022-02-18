package solutions.stream;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez namesToStringWithStream pour renvoyer une chaîne
 * comportant les noms des personnes, séparés par des virgules.
 * Elle devra avoir le même comportement que namesToString
 *
 *************
 *
 * Resultat attendu :
 * Names: Sara, Eva, Viktor.
 */
public class Exo9 {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> persons = asList(sara, eva, viktor);

        String result = namesToString(persons);
        System.out.println(result);

        String result2 = namesToStringWithStream(persons);
        System.out.println(result2);

    }

    public static String namesToString(List<Person> people) {
        StringJoiner joiner = new StringJoiner(", ", "Names: ", ".");
        for (Person person : people) {
            joiner.add(person.getName());
        }
        return joiner.toString();
    }

    public static String namesToStringWithStream(List<Person> people) {
        return people.stream()
                .map(p -> p.getName())
                .collect(Collectors.joining(", ", "Names: ", "."));
    }


}

