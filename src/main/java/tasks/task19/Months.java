package tasks.task19;

/**
 * Created by Dmytro on 5/30/2015.
 */
public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int days;

    Months(int days) {
        this.days = days;
    }

    int getDays() {
        return days;
    }
}