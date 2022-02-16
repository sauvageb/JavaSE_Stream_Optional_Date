package exercices.stream;


import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class Exo10Test {

    @Test
    public void test_exercice() {
        assertThat(Exo10.getString(asList(3, 44))).isEqualTo("i3,p44");
        assertThat(Exo10.getString(singletonList(3))).isEqualTo("i3");
    }

    @Test
    public void test_solution() {
        assertThat(Exo10.getStringWithStream(asList(3, 44))).isEqualTo("i3,p44");
        assertThat(Exo10.getStringWithStream(singletonList(3))).isEqualTo("i3");
    }
}
