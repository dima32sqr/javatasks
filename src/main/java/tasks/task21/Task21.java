package tasks.task21;

import java.util.Map;

/**
 * Created by Dmytro on 6/29/2015.
 */
public class Task21 {
    static final int MAX_VALUE = 9_999;
    int summOfAmicableNumbers = 0;

    public static void main(String[] args) {
        Task21 t = new Task21();
        for (int i = 1; i < 10000; i++) {
            if (t.isAmicableNumber(i)) {
                t.summOfAmicableNumbers += i;
            }
        }
        System.out.println(t.summOfAmicableNumbers);
    }

    int getSumProperDivisors(int evaluatedNumber) {
        int sumOfProperDivisors = 0;
        for (int i = 1; i < evaluatedNumber; i++) {
            if (evaluatedNumber % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors;
    }

    boolean isAmicableNumber(int number) {
        int a = getSumProperDivisors(number);
        int b = getSumProperDivisors(a);
        return (b == number && a != number);
    }
}
