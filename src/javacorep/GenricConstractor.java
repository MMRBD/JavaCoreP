package javacorep;

/**
 *
 * @author mokle
 */
public class GenricConstractor {

    public static void main(String[] args) {
        GenCons cons1 = new GenCons(100);
        GenCons cons2 = new GenCons(100.121);
        
        cons1.showVal();
        cons2.showVal();
    }
}

class GenCons {

    private double val;

    <T extends Number> GenCons(T args) {
        val = args.doubleValue();
    }

    void showVal() {
        System.out.println("Val: " + val);
    }

}
