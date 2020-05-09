import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz1() {
        int number =3;
        String  expected = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz2() {
        int number =5;
        String  expected = "Buzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz3() {
        int number =15;
        String  expected = "FizzBuzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz5() {
        int number =13;
        String  expected = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz6() {
        int number =51;
        String  expected = "Buzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }


    @Test
    void fizzBuzz4() {
        int number =11;
        String  expected = "11";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
}