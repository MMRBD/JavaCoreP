package javacorep;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author mokle
 */
public class VactorExample {

    public static void main(String[] args) {
        Vector v = new Vector(3, 2);
        System.out.println("Vector Size: " + v.size() + " Capacity: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Vector Size: " + v.size() + " Capacity: " + v.capacity());

        v.addElement(12.05);
        v.addElement(11.05);
        v.addElement(13.05);
        System.out.println("Vector Size: " + v.size() + " Capacity: " + v.capacity());

        if (v.contains(13.05)) {
            System.out.println("Found it");
        }

        Enumeration vEnumeration = v.elements();
        while (vEnumeration.hasMoreElements()) {
            System.out.print(vEnumeration.nextElement() + " ");
        }
        System.out.println();
    }

}
