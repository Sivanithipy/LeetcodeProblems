class noofdysbttwodates {
    
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysSince1971(date1) - daysSince1971(date2));
    }

    private int daysSince1971(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int days = 0;
        for (int y = 1971; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeapYear(year)) {
                days += 29;
            } else {
                days += DAYS_IN_MONTH[m - 1];
            }
        }
        days += day;

        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
