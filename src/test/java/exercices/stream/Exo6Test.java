package exercices.stream;


import org.junit.jupiter.api.Test;

import java.util.List;

import static exercices.stream.Exo5.calculateWithStream;
import static exercices.stream.Exo6.getKidNames;
import static exercices.stream.Exo6.getKidNamesWithStream;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class Exo6Test {

    @Test
    public void test_exercice() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

    @Test
    public void test_solution() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(getKidNamesWithStream(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }
}
