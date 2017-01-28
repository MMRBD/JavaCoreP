package javacorep;
//Answer is NO

/**
 *
 * @author mokle
 */
public class IsConstructorSt6atic {

    public static void main(String[] args) {
        Y y = new Y();
        y.display();
    }

}

class X {

    public X() {
        System.out.println("Super");
    }

}

class Y extends X {

    void display() {
        System.out.println("Sub Method");
    }

}
