package exercices.stream;


import org.junit.jupiter.api.Test;

import static exercices.stream.Exo2.getTotalNumberOfLettersOfNamesLongerThanFive;
import static exercices.stream.Exo2.getTotalNumberOfLettersOfNamesLongerThanFiveWithStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo2Test {

    @Test
    public void test_exercice() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
    }

    @Test
    public void test_solution() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFiveWithStream("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFiveWithStream("aaron"), 0);
    }
}
