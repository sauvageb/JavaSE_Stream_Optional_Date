package exercices.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

class Exo1Test {

    private Exo1 exo1 = new Exo1();

    /**
     * Testing exercices
     **/
    @Test
    public void test_exercice_1_findPhoneNumberByName() {
        String phoneNumber = exo1.findPhoneNumberByName("Jos de Vos");
        assertThat(phoneNumber).isEqualTo("016/161616");
    }

    @Test
    public void test_exercice_1_findPhoneNumberByName_NotFound() {
        String phoneNumber = exo1.findPhoneNumberByName("Jos de Voss");
        assertNull(phoneNumber);
    }

    @Test
    public void test_exercice_2_findNameByPhoneNumber() {
        String name = exo1.findNameByPhoneNumber("016/161616");
        assertThat(name).isEqualTo("Jos de Vos");
    }

    @Test
    public void test_exercice_2_findNameByPhoneNumber_NotFound() {
        String name = exo1.findPhoneNumberByName("016/161619");
        assertNull(name);
    }

    /**
     * Testing solutions
     **/
    @Test
    public void test_solution_1_findPhoneNumberByNameWithOptional() {
        Optional<String> phoneNumber = exo1.findPhoneNumberByNameWithOptional("Jos de Vos");
        assertThat(phoneNumber.get()).isEqualTo("016/161616");
    }

    @Test
    public void test_solution_1_findPhoneNumberByNameWithOptional_NotFound() {
        Optional<String> phoneNumber = exo1.findPhoneNumberByNameWithOptional("Jos de Voss");
        Assertions.assertFalse(phoneNumber.isPresent());
    }

    @Test
    public void test_solution_2_findNameByPhoneNumberWithOptional() {
        Optional<String> name = exo1.findNameByPhoneNumberWithOptional("016/161616");
        assertThat(name.get()).isEqualTo("Jos de Vos");
    }

    @Test
    public void test_solution_2_findNameByPhoneNumber_NotFound() {
        Optional<String> name = exo1.findNameByPhoneNumberWithOptional("016/161619");
        Assertions.assertFalse(name.isPresent());
    }
}
