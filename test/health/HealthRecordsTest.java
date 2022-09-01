package health;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthRecordsTest {
    HealthRecords health;
    HealthRecords age;

    @BeforeEach
    public void setUp() {
        health = new HealthRecords("Jennifer", "Owolabi", 10, "Female", 2022, "Monday", 60.0, 5.9, 20);
    }

    @Test
    public void testingSetFirstName() {
        assertEquals("Jennifer", health.getFirstName());
    }

    @Test
    public void testingSetlastName() {
        assertEquals("Owolabi", health.getLastName());
    }

    @Test
    public void testingSetMonth() {
        assertEquals(10, health.getMonth());
    }

    @Test
    public void testingThatGenderExist() {
        assertEquals("Female", health.getGender());
    }

    @Test
    public void testingThatYearExist() {
        health.setYear(2022);
        assertEquals(2022, health.getYear());
    }

    @Test
    public void testingThatDayExist() {
        assertEquals("Monday", health.getDay());
    }

    @Test
    public void calculateAgeInYears() {
         assertEquals(0, health.setCalculationAge());
        }

    @Test
    public void setMaximum_HeartRate(){

    }

    }



