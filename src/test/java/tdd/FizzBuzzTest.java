package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.FizzBuzz;

public class FizzBuzzTest {

    //Methoden fizzbuzz
    //Parameter: int
    //Rückgabetyp: String

    @Test
    void whenNotDividableBy3Or5_thenReturnNumberAsString(){
        //GIVEN
        int number = 4;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);

        //THEN
        String expected = "4";
        Assertions.assertEquals(expected, actual);
    }

    //Wenn Parameter durch 3 teilbar ist, dann soll "fizz" zurückgegeben werden.

    @Test
    void whenDividableBy3_thenReturnFizz(){
        //GIVEN
        int number = 9;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);

        //THEN
        String expected = "fizz";
        Assertions.assertEquals(expected, actual);
    }

    //Wenn der Parameter durch 5 teilbar ist, dann soll "buzz" zurürckgeben werden.

    @Test
    void whenDividableBy5_thenReturnBuzz(){
        //GIVEN
        int number = 5;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);

        //THEN
        String expected = "buzz";
        Assertions.assertEquals(expected, actual);
    }

    //Wenn der Parameter durch 3 und durch 5 teilbar ist, dann soll "fizzbuzz" zurückgegeben werden

    @Test
    void whenDividableBy5And3_thenReturnFizzBuzz(){
        //GIVEN
        int number = 15;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);

        //THEN
        String expected = "fizzbuzz";
        Assertions.assertEquals(expected, actual);
    }
}
