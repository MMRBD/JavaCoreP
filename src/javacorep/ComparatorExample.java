
package javacorep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author moklesur 
 */
public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<AnotherStudent> al = new ArrayList<>();
        al.add(new AnotherStudent(1201, "MOKLESUR", 21));
        al.add(new AnotherStudent(1203, "IABUR", 25));
        al.add(new AnotherStudent(1205, "IMRAN", 20));
        al.add(new AnotherStudent(1207, "Abu", 30));

        Collections.sort(al, new AgeComparator());

        Iterator<AnotherStudent> itr = al.iterator();

        while (itr.hasNext()) {
            AnotherStudent next = itr.next();
            System.out.println(next.roll + " " + next.name + " " + next.age);

        }
        
        System.out.println("Name Comparator: ");
        Collections.sort(al, new NameComparator());
        Iterator<AnotherStudent> itr1 = al.iterator();

        while (itr1.hasNext()) {
            AnotherStudent next = itr1.next();
            System.out.println(next.roll + " " + next.name + " " + next.age);

        }
        

    }

}
