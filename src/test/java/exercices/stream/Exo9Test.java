package exercices.stream;


import org.junit.jupiter.api.Test;

import java.util.List;

import static exercices.stream.Exo9.namesToString;
import static exercices.stream.Exo9.namesToStringWithStream;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class Exo9Test {

    @Test
    public void test_exercice() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(namesToString(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }

    @Test
    public void test_solution() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(namesToStringWithStream(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }
}
