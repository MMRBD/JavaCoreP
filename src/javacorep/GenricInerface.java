package javacorep;

/**
 *
 * @author mokle
 */
public class GenricInerface {

    public static void main(String[] args) {
        Integer[] iNums = {1, 5, 4, 3, 4, 7, 9, 8};
        Character[] chs = {'A', 'P', 'W', 'T'};

        Myclass<Integer> iObj = new Myclass<>(iNums);
        Myclass<Character> chObj = new Myclass<>(chs);
        System.out.println("Int Max: " + iObj.max());
        System.out.println("Int Min: " + iObj.min());

        System.out.println("Char Max: " + chObj.max());
        System.out.println("Char Min: " + chObj.min());

    }
}

interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}

class Myclass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    public Myclass(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }

        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }

        }
        return v;
    }

}
