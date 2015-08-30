package fourthchapter.encapsulation.pond.shore;

import fourthchapter.encapsulation.pond.shore.Bird;

/**
 * Created by Dmytro on 6/8/2015.
 */
public class AngryBird {
    public void say() {
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
