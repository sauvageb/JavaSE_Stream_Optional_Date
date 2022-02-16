package solutions.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        Person olderPerson1 = getOldestPerson(persons);
        System.out.println(olderPerson1);

        Person olderPerson2 = getOldestPersonWithStream(persons);
        System.out.println(olderPerson2);
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

    public static Person getOldestPersonWithStream(List<Person> people) {
        Optional<Person> personOptional = people
                .stream()
                .max(Comparator.comparingInt(Person::getAge));

        if (!personOptional.isPresent()) {
            throw new RuntimeException("Person not found");
        }
        return personOptional.get();
    }
}

