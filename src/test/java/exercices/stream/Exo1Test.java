package exercices.stream;

import org.junit.jupiter.api.Test;

import static exercices.stream.Exo1.mapToUppercase;
import static exercices.stream.Exo1.mapToUppercaseWithStream;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exo1Test {

    @Test
    public void test_exercice() {
        System.out.println("Testing if [aaron, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM]");
        assertTrue(mapToUppercase("aaron", "frank", "william", "gilliam")
                .containsAll(asList("AARON", "FRANK", "WILLIAM", "GILLIAM")));

        System.out.println("Testing if [cegeka] returns [CEGEKA]");
        assertTrue(mapToUppercase("cegeka")
                .containsAll(singletonList("CEGEKA")));
    }

    @Test
    public void test_solution() {
        System.out.println("Testing if [aaron, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM]");
        assertTrue(mapToUppercaseWithStream("aaron", "frank", "william", "gilliam")
                .containsAll(asList("AARON", "FRANK", "WILLIAM", "GILLIAM")));

        System.out.println("Testing if [cegeka] returns [CEGEKA]");
        assertTrue(mapToUppercaseWithStream("cegeka")
                .containsAll(singletonList("CEGEKA")));
    }
}
