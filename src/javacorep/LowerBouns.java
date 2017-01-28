package javacorep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mokle
 */
public class LowerBouns {

    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        list1.add(1.20);
        list1.add(2.20);
        list1.add(3.50);
        list1.add(4.55);
        list1.add(52.20);
        sum(list1);
    }

    static void sum(List<? super Integer> element) {
        int sum =0;
       
    }

}
