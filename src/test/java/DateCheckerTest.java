import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;  //Allows us to pass in multiple values into one unitTest
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource( value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY",
                                                                "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        boolean actual = dateChecker.has31Days(month);
        String expectedMessage = month + " should have 31 days";
        assertTrue(actual,expectedMessage);
    }

    @ParameterizedTest
    @EnumSource( value = DateChecker.Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month){
        boolean actual = dateChecker.has31Days(month);
        String expectedMessage = month + " should not have 31 days";
        assertFalse(actual,expectedMessage);
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        boolean actual = dateChecker.has31Days(DateChecker.Month.FEBRUARY);
        String expectedMessage = " February should not have 31 days";
        assertFalse(actual,expectedMessage);
    }

    @Test
    public void testInvalidMonth(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateChecker.has31Days(null));
        String expectedMessage = "Month Input is Invalid";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }

}
