package javacorep;

/**
 *
 * @author mokle
 */
public class GamricClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public static void main(String[] args) {
        GamricClass <String> stringValue = new GamricClass();
        GamricClass <Integer> integerValue = new GamricClass();
        stringValue.add("HHi I am String");
        integerValue.add(120);
        
        System.out.println(stringValue.getT());
        System.out.println(integerValue.getT());
                
    }

}
