package tasks.task19;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytro on 5/30/2015.
 */
public class CS2 {

    public static void main(String[] args) {
        CS2 cs = new CS2();
        List<Integer> daysOfLeapYear = cs.generateDaysForLeapYear();
        List<Integer> daysOfNotLeapYear = cs.generateDaysForNotLeapYear();
        List<Integer> allDays = new ArrayList<Integer>();
        for (int year = 1900; year <= 2000; year++) {
            if (cs.isLeapYear(year)) {
                allDays.addAll(daysOfLeapYear);
            }
            else {
                allDays.addAll(daysOfNotLeapYear);
            }
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

    private List<Integer> generateDaysForLeapYear() {
        List<Integer> daysOfLeapYear = new ArrayList<Integer>();
        for (Months month: Months.values()) {
            if (month == Months.FEBRUARY) {
                daysOfLeapYear.addAll(generateDaysForMonth(month.getDays()+1));
            }
            else {
                daysOfLeapYear.addAll(generateDaysForMonth(month.getDays()));
            }
        }
        return daysOfLeapYear;
    }

    private List<Integer> generateDaysForNotLeapYear() {
        List<Integer> daysOfNotLeapYear = new ArrayList<Integer>();
        for (Months month: Months.values()) {
            daysOfNotLeapYear.addAll(generateDaysForMonth(month.getDays()));
        }
        return daysOfNotLeapYear;
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
