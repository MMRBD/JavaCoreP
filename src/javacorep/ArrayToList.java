package javacorep;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mokle
 */
public class ArrayToList {

    public static void main(String[] args) {
//        String[] myArray = new String[]{"MMR", "Iabur", "Imran", "Tareq"};
//
//        List<String> arrayList = Arrays.asList(myArray);
//
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
        String myArray[] = createArray();
        List <String> myList = Arrays.asList(myArray);
        
        System.out.println(".......Iterator Loop.......");
        long IteratorStartTime = new Date().getTime();
        System.out.println("Star: "+IteratorStartTime);
        
        Iterator <String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            
        }
        System.out.println(".......Iterator Loop.......");
        long IteratorEndTime = new Date().getTime();
        System.out.println("Star: "+IteratorEndTime);
        
        long iDeffarent = IteratorEndTime-IteratorStartTime ;
        System.out.println("Iterator Compile Time: "+iDeffarent);
        
        
        System.out.println(".......While Loop.......");
        long wHILEStartTime = new Date().getTime();
        System.out.println("Star: "+wHILEStartTime);
        int j=0;
        while (myList.size()>j) {            
            j++;
        }
        
        System.out.println(".......Iterator Loop.......");
        long WhileEndTime = new Date().getTime();
        System.out.println("Star: "+WhileEndTime);
        long WDeffarent = IteratorEndTime-IteratorStartTime ;
        System.out.println("While Compile Time: "+WDeffarent);
        
    }

    static String[] createArray() {
        String[] sArray = new String[550000];
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = "Array" + i;
        }
        return sArray;
    }
}
