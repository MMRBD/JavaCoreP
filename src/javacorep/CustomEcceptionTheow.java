package javacorep;

/**
 *
 * @author Moklesur Rahman
 */
public class CustomEcceptionTheow {

    public static void main(String[] args) {
        try {
            valided(10);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    static void valided(int age) throws CustomThrows{
        if (age < 12) {
            throw new CustomThrows("Nor Alows");
        } else {
            System.out.println("Welcome");
        }
    }
}

class CustomThrows extends Exception {

    public CustomThrows(String a) {
        super(a);
    }

}
