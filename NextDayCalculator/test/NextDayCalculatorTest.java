import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getNextDay1() throws ParseException {
        String date = "2018-01-01";
        String expected = "2018-01-02";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);

    }
    @Test
    void getNextDay2() throws ParseException {
        String date = "2018-01-31";
        String expected = "2018-02-01";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);
    }
    @Test
    void getNextDay3() throws ParseException {
        String date = "2018-04-30";
        String expected = "2018-05-01";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);
    }
    @Test
    void getNextDay4() throws ParseException {
        String date = "2018-02-28";
        String expected = "2018-03-01";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);
    }
    @Test
    void getNextDay5() throws ParseException {
        String date = "2020-02-29";
        String expected = "2020-03-01";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);
    }
    @Test
    void getNextDay6() throws ParseException {
        String date = "2020-12-31";
        String expected = "2021-01-01";
        String result = NextDayCalculator.getNextDay(date);
        assertEquals(expected,result);
    }
}