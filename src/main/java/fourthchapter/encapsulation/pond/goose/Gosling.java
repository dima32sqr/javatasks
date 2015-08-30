package fourthchapter.encapsulation.pond.goose;

import fourthchapter.encapsulation.pond.shore.Bird;

/**
 * Created by Dmytro on 6/8/2015.
 */
public class Gosling extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }
}
