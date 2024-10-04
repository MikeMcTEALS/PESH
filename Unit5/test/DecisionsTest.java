import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class DecisionsTest {

    @ParameterizedTest
    @DisplayName("Testing getDriverMessage")
    @CsvSource({
            "35, 20, SLOW",
            "35, 30, GOOD",
            "35, 35, GOOD",
            "35, 50, FAST",
            "20, 50, FAST",
            "20, 18, GOOD",
            "20, 5, SLOW",
            "20, 35, FAST",
            "75, 60, SLOW",
            "75, 75, GOOD",
            "75, 80, GOOD",
            "75, 100, FAST"
    })
    public void testGetDriverMessage(int limit, int speed, String expResult) {
        String result = Decisions.getDriverMessage(limit, speed);
        assertEquals(expResult, result);
    }

    @Test
    void checkZip() {
    }

    /**
     * Test of getGeneration method, of class Decisions.
     */
    @ParameterizedTest
    @DisplayName("Testing getGeneration")
    @CsvSource({
            "1900, Greatest Generation",
            "1915, Greatest Generation",
            "1924, Greatest Generation",
            "1925, Silent Generation",
            "1930, Silent Generation",
            "1950, Baby Boom Generation",
            "1970, Generation X",
            "1990, Generation Y",
            "2000, Generation Z",
            "2024, Invalid birth year. Must be between 1900 and 2016"
    })
    public void testGetGeneration(int birthYear, String expResult) {
        System.out.println("getGeneration");
        String result = Decisions.getGeneration(birthYear);
        assertEquals(expResult, result);

    }

    @ParameterizedTest
    @DisplayName("Testing checkRoom")
    @CsvSource({
            "Adams, B260A",
            "Baker, B260A",
            "Charlie, B260A",
            "Decker, B260A",
            "Edwards, B260B",
            "Mbenga, UNKNOWN",
            "McIntyre, B262",
            "Shai, UNKNOWN",
            "Shannon, UNKNOWN",
            "'', Invalid input. Last name should have at least 1 character"
    })
    void checkRoom(String lastName, String expResult) {
        System.out.println("Testing checkRoom");
        assertEquals(expResult, Decisions.checkRoom(lastName));
    }

    @ParameterizedTest
    @DisplayName("Testing getWeightStatus")
    @CsvSource({
            "-1.0, BMI must be a positive number",
            "12.0, underweight",
            "18.5, normal",
            "18.6, normal",
            "24.9, normal",
            "28.3, overweight",
            "47.1, obese"
    })
    void getWeightStatus(double bmi, String expResult) {
        System.out.println("Testing getWeightStatus");
        assertEquals(expResult, Decisions.getWeightStatus(bmi));
    }
}