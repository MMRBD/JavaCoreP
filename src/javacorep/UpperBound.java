
package javacorep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mokle
 */
public class UpperBound {
    
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(1.20);
        list1.add(2.20);
        list1.add(3.50);
        list1.add(4.55);
        list1.add(52.20);
        sum(list1);
    }
    static void sum(List<? extends Number> valu){
        int sum=0;
        for(Number nums: valu){
            sum+=nums.intValue();
        }
        System.out.println(sum);
    }
    
}
