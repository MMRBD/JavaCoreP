package javacorep;

/**
 *
 * @author mokle
 * @param <T>
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
        GamricClass<String> stringValue = new GamricClass();
        GamricClass<Integer> integerValue = new GamricClass();
        stringValue.add("HHi I am String");
        integerValue.add(120);

        System.out.println(stringValue.getT());
        System.out.println(integerValue.getT());

        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {12.50, 20.20, 30.10};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("This is Int Genric: ");
        printArray(intArray);
        System.out.println("This is Double Genric: ");
        printArray(doubleArray);
        System.out.println("This is Char Genric: ");
        printArray(charArray);
    }

    public static <T> void printArray(T[] element) {
        for (T e : element) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

}
