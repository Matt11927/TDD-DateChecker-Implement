import java.util.Arrays;

public class DateChecker {
    /**
     * Months with 31 days: January, March, May, July, August, October, December.
     * February has 28 days (29 in leap years).
     * Months with 30 days: April, June, September, November.
     **/
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY,
        JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
        NOVEMBER, DECEMBER
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
                                                            Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month){
        if(month == null){
            throw new IllegalArgumentException("Month Input is Invalid");
        } else if (Arrays.asList(monthThirtyOneDays).contains(month)){
            return true;
        }else{
            return false;
        }
    }


}
