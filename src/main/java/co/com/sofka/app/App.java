package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        menu(bufferedReader);
    }


    private static void menu(BufferedReader bufferedReader) throws IOException {

        System.out.println( "Menu: " );
        System.out.println( "1. Suma " );
        System.out.println( "2. Resta " );
        System.out.println( "3. Multiplicación " );
        System.out.println( "4. Resta " );

        String menu = bufferedReader.readLine();
        optionOperation(menu,bufferedReader );
    }

    private static void optionOperation( String option , BufferedReader bufferedReader) throws IOException {

        int value = Integer.parseInt(option);

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );
        Long result=0L;

        switch (value){
            case 1:
                BasicCalculator calculatorSuma = new BasicCalculator();
                result = BasicCalculator.sum( number1, number2 );
                break;
            case 2:
                BasicCalculator calculatorResta = new BasicCalculator();
                result = BasicCalculator.subtraction( number1, number2 );
                break;
            case 3:
                result = BasicCalculator.multiplication( number1, number2 );
                break;
            case 4:
                result = BasicCalculator.division( number1, number2 );
                break;
        }

        System.out.println( number1 + " + " + number2 + " = " + result );
    }
}
