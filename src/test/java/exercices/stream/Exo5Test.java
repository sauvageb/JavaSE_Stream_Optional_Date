package exercices.stream;


import org.junit.jupiter.api.Test;

import java.util.List;

import static exercices.stream.Exo5.calculate;
import static exercices.stream.Exo5.calculateWithStream;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class Exo5Test {

    @Test
    public void test_exercice() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

    @Test
    public void test_solution() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculateWithStream(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }
}
