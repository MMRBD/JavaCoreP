
package javacorep;

/**
 *
 * @author mokle
 */
public class genricSubClass {

    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<>("Value of: ", 12);

        System.out.println(x.getObj());
        System.out.println(x.getOb2());
    }
}

class Gen<T> {

    T obj;

    public Gen(T obj) {
        this.obj = obj;

    }

    public T getObj() {
        return obj;
    }

}

class Gen2<T, V> extends Gen<T> {

    V ob2;

    public Gen2(T obj, V obj2) {
        super(obj);
        this.ob2 = obj2;
    }

    public V getOb2() {
        return ob2;
    }

}
