package exercices.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez groupByNationalityWithStream pour regrouper les personnes par nationalité
 * Elle devra avoir le même comportement que groupByNationality
 *
 *************
 *
 * Resultat attendu :
 * {
 * Serbian= [ exercices.stream.Person{name='Viktor', age=40, nationality='Serbian'} ],
 * Norwegian= [ exercices.stream.Person{name='Sara', age=4, nationality='Norwegian'}, exercices.stream.Person{name='Eva', age=42, nationality='Norwegian'} ]
 * }
 */
public class Exo8 {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> persons = asList(sara, eva, viktor);

        Map<String, List<Person>> result = groupByNationality(persons);
        System.out.println(result);
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    // TODO
    public static Map<String, List<Person>> groupByNationalityWithStream(List<Person> people) {
        return null;
    }


}

