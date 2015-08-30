package fourthchapter.encapsulation.pond.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytro on 6/18/2015.
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.isCanHop());
    }


    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal: animals) {
            if (checker.test(animal)) {
                System.out.print(animal.getSpecies() + " ");
            }
        }
        System.out.println();
    }
}
