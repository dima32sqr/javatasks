package fourthchapter.encapsulation.pond;

/**
 * Created by Dmytro on 6/18/2015.
 */
public class Encaps {
    private StringBuilder sb;
    public Encaps(StringBuilder sb) {
        this.sb = new StringBuilder(sb);
    }
    public StringBuilder getSb() {
        return new StringBuilder(sb);
    }
}
