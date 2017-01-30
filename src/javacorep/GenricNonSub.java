package javacorep;

/**
 *
 * @author mokle
 */
public class GenricNonSub {

    public static void main(String[] args) {
        GenicSub<String> w = new GenicSub<>("Hello: ", 120);

        System.out.println(w.getOb() + " " + w.getNum());
    }
}

class NoGen {

    int num;

    public NoGen(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    

}

class GenicSub<T> extends NoGen {

    T ob;

    public GenicSub(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    @Override
    public int getNum() {
        
        return 50; 
    }
    

}
