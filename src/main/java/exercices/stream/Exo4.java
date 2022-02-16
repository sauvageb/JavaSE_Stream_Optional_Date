package exercices.stream;

import java.util.List;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez getOldestPersonWithStream pour récupérer la personne la plus âgée de la liste
 * Elle devra avoir le même comportement que getOldestPerson
 *
 *************
 *
 * Resultat attendu : exercices.stream.Person{name='Eva', age=42, nationality=''}
 *
 */
public class Exo4 {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> persons = asList(sara, eva, viktor);

        Person olderPerson = getOldestPerson(persons);
        System.out.println(olderPerson);
    }

    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    // TODO
    public static Person getOldestPersonWithStream(List<Person> people) {
        return null;
    }
}

