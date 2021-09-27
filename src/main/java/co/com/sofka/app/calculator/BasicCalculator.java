package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public static Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public static Long subtraction(Long number1, Long number2) {
        logger.info( "subtracting {} + {}", number1, number2 );
        return number1 - number2;
    }

    public static Long multiplication(Long number1, Long number2) {
        logger.info( "subtracting {} + {}", number1, number2 );
        return number1 * number2;
    }

    public static Long division(Long number1, Long number2) {
        logger.info( "subtracting {} / {}", number1, number2 );
        if (number2 == 0L) {
            throw new RuntimeException("cannot be divided by zero");
        }
        return number1 / number2;
    }



}
