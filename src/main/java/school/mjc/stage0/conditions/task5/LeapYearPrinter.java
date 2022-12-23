package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }
        if (!isLeapYear)
            System.out.println("not leap");
        else
            System.out.println("leap");
    }
}
