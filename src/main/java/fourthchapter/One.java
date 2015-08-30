package fourthchapter;

/**
 * Created by Dmytro on 6/14/2015.
 */
public class One {
    int i = 1;
    public static void main(String[] args) {

change(5);
        One one = new One();
        one.change(one.i);
        System.out.println(one.i);
    }
    public static void change(int i) {
        i = 0;
    }
}

