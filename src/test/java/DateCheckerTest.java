import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;  //Allows us to pass in multiple values into one unitTest
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

}
