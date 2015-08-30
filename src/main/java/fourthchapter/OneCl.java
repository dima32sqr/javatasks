package fourthchapter;

/**
 * Created by Dmytro on 6/17/2015.
 */
public class OneCl {
   OneCl(int i) {

   }
    final public int i = 1;
    OneCl(int i, int y) {
this(1);
    }

    OneCl(String s) {
//        this(3);
        this(3,5);
    }
    void methid() {
    return;
    }

    private static OneCl oneCl = new OneCl(3);


}
