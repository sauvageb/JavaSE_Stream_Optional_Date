package exercices.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class Exo1Test {

    Exo1 exo1 = new Exo1();

    /**
     * Testing exercices
     **/
    @Test
    public void test_exercice_1_getToday() {
        Date today = exo1.getToday();
        assertTrue(LocalDate.now().isEqual(today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
    }

    /**
     * Testing solutions
     **/
    @Test
    public void test_solution_1_getTodayWithJava8() {
        Object today = exo1.getTodayWithJava8();
        assertTrue(today instanceof ZonedDateTime);
    }
}
