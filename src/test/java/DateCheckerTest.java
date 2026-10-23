import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;  //Allows us to pass in multiple values into one unitTest
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days(){
        boolean actual = dateChecker.has31Days(DateChecker.Month.JANUARY);
        String expectedMessage = "January should have 31 days";
        assertTrue(actual, expectedMessage);
    }

    @Test
    public void testNovemberDoesNotHave31Days(){
        boolean actual = dateChecker.has31Days(DateChecker.Month.NOVEMBER);
        String expectedMessage = "November should not have 31 days";
        assertFalse(actual,expectedMessage);
    }

    @ParameterizedTest
    @EnumSource( value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY",
                                                                "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        boolean actual = dateChecker.has31Days(month);
        String expectedMessage = month + " Should have 31 days";
        assertTrue(actual,expectedMessage);
    }

}
