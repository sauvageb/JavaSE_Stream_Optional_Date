package exercices.stream;

import java.util.List;

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
    }

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    // TODO
    public static String namesToStringWithStream(List<Person> people) {
        return null;
    }


}

