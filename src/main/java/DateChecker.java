public class DateChecker {
    /**
     * The twelve months in the year,
     * in which be used for date validation.
     * January, March, May, July, August, October, December – 31 days
     * February – 28 days (29 in leap years)
     * April, June, September, November – 30 days
     **/
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month){
        return month == Month.JANUARY || month == Month.MARCH || month == Month.MAY ||
               month == Month.JULY || month == Month.AUGUST || month == Month.OCTOBER ||
               month == Month.DECEMBER;
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
                                                            Month.AUGUST, Month.OCTOBER, Month.DECEMBER};


}
