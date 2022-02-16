package exercices.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez partitionAdultsWithStream pour séparer ces personnes en adultes et en enfants
 * Elle devra avoir le même comportement que partitionAdults
 *
 *************
 *
 * Resultat attendu :
 * {
 * false= [ exercices.stream.Person{name='Sara', age=4, nationality=''} ],
 * true=  [ exercices.stream.Person{name='Eva', age=42, nationality=''}, exercices.stream.Person{name='Viktor', age=40, nationality=''} ]
 * }
 *
 */
public class Exo7 {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> persons = asList(sara, eva, viktor);

        Map<Boolean, List<Person>> result = partitionAdults(persons);
        System.out.println(result);
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    // TODO
    public static Map<Boolean, List<Person>> partitionAdultsWithStream(List<Person> people) {
        return null;
    }


}

