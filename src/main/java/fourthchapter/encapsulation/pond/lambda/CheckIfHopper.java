package fourthchapter.encapsulation.pond.lambda;

/**
 * Created by Dmytro on 6/18/2015.
 */
public class CheckIfHopper implements  CheckTrait{
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
