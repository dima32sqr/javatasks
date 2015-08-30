package thirdchapter;

import java.lang.reflect.Array;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmytro on 5/30/2015.
 */
public final class FinalCl {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period p = Period.ofDays(2).ofYears(2).ofDays(1);
        date= date.minus(p);
        System.out.println(date);
    }

}

