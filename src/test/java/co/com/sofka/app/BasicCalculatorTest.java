package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, BasicCalculator.sum(first, second));
    }

    @DisplayName("Testing several subtraction")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "100,    1,   99",
            "4,    89,   -85",
            "49,  51, -2",
            "100,  50, 50"
    })
    public void severalSubtraction(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, BasicCalculator.subtraction(first, second));
    }

    @DisplayName("Testing several multiplication")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "100,    1,   100",
            "4,    2,   8",
            "3,  -21, -63",
            "100,  50, 5000"
    })
    public void severalMultiplication(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, BasicCalculator.multiplication(first, second));
    }

    @DisplayName("Testing several division")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "100,    1,   100",
            "4,    0,   'cannot be divided by zero'",
            "6,  3, 2",
            "100,  50, 2"
    })
    public void severalDivision(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, BasicCalculator.division(first, second));
    }
}
