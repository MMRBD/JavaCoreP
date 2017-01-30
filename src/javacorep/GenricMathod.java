package javacorep;

/**
 *
 * @author mokle
 */
public class GenricMathod {

    public static void main(String[] args) {
        Integer[] nums = {2, 3, 5, 8, 9, 10};
        if(isIn(10, nums)){
            System.out.println("2 is in nums");
        }
        if(!isIn(102, nums)){
            System.out.println("102 is not in nums");
        }
        String[] strs ={"one","two","three","four"};
        
        if(isIn("one", strs)){
            System.out.println("one is in strs");
        }
        if(!isIn("eight", strs)){
            System.out.println("eight is not in strs");
        }
    }

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
}
