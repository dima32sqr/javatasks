package tasks.task19;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytro on 5/30/2015.
 */
public class CountSundays {

    public static void main(String[] args) {
        CountSundays cs = new CountSundays();
        List<Integer> allDays = new ArrayList<Integer>();
        for (int i = 1900; i <= 2000; i++) {
            allDays.addAll(cs.generateDaysForYear(i));
        }
        System.out.println(cs.getCountOfSundaysOnFirst(allDays));
    }

    /**
     * verify if provided year is leap or not
     * @param year
     * @return true or false depends on which kind of year it is (leap or not)
     */
    private boolean isLeapYear(int year) {
        boolean isNotLeap = (year%100==0) & (year%400 != 0);
        if (year%4==0 && !isNotLeap) {
            return true;
        }
        else {
            return false;
        }
    }

    private List<Integer> generateDaysForYear(int year) {
        List<Integer> daysOfYear = new ArrayList<Integer>();
        boolean leapYear = isLeapYear(year);

        for (Months month: Months.values()) {
            if (month == Months.FEBRUARY && leapYear) {
                daysOfYear.addAll(generateDaysForMonth(month.getDays()+1));
            }
            daysOfYear.addAll(generateDaysForMonth(month.getDays()));
        }
        return daysOfYear;
    }

    private List<Integer> generateDaysForMonth(int maxDays) {
        List<Integer> daysOfMonth = new ArrayList<Integer>();
        for (int i = 1; i <= maxDays; i++) {
            daysOfMonth.add(i);
        }
        return daysOfMonth;
    }

    private int getCountOfSundaysOnFirst(List<Integer> allDays) {
        int count = 0;
        for (int i = 6; i <= allDays.size(); i+=7) {
            if (allDays.get(i)==1 && i>=365) {
                count++;
            }
        }
        return count;
    }


}
