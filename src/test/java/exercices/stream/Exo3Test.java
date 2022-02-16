package exercices.stream;


import org.junit.jupiter.api.Test;

import java.util.List;

import static exercices.stream.Exo3.transform;
import static exercices.stream.Exo3.transformWithStream;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class Exo3Test {

    @Test
    public void test_exercice() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void test_solution() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(transformWithStream(collection)).hasSameElementsAs(expected);
    }
}
