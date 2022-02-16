package exercices.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez getKidNamesWithStream pour obtenir les noms de tous les enfants de moins de 18 ans
 * Elle devra avoir le même comportement que getKidNames
 *
 *************
 *
 * Resultat attendu : [Sara, Anna]
 *
 */
public class Exo6 {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> persons = asList(sara, eva, viktor, anna);

        Set<String> olderPerson = getKidNames(persons);
        System.out.println(olderPerson);
    }

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    // TODO
    public static Set<String> getKidNamesWithStream(List<Person> people) {
        return null;
    }


}

