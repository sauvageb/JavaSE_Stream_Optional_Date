package exercices.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class Exo2Test {

    private Exo2 exo2 = new Exo2();

    /**
     * Testing exercices
     **/
    @Test
    public void test_exercice_1_findPhoneNumberByNameAndPunishIfNothingFound() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String result = exo2.findPhoneNumberByNameAndPunishIfNothingFound("Boris Sauvage");
        });
        Assertions.assertEquals("No phone number found", thrown.getMessage());
    }

    /**
     * Testing solutions
     **/
    @Test
    public void test_solution_1_findPhoneNumberByNameAndPunishIfNothingFoundWithOptional() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Optional<String> result = exo2.findPhoneNumberByNameAndPunishIfNothingFoundWithOptional("Boris Sauvage");
            result.get();
        });
        Assertions.assertEquals("No phone number found", thrown.getMessage());
    }
}
