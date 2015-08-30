package fourthchapter.encapsulation.pond.swan;

import fourthchapter.encapsulation.pond.shore.Bird;

/**
 * Created by Dmytro on 6/8/2015.
 */
public class Swan extends Bird {
    static int i = 1;
    public void swim() {
        floatInWater();
        System.out.println(text);
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public static void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater();
    }

    public void doSth() {
        Swan.helpOtherBirdSwim();
        helpOtherBirdSwim();
        System.out.println(i);
    }

    public static String sTh() {
        return "cool";
    }

    public String notStatic() {
        return "cool as well";
    }

    public static void main(String[] args) {
        Swan swan = null;
        System.out.println(swan.sTh());
        System.out.println(swan.notStatic());
        sTh();
    }


}
