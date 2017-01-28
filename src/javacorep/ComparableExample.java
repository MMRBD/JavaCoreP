/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author mokle
 */
public class ComparableExample {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1205, "MOKLESUR", 21));
        al.add(new Student(1205, "IABUR", 25));
        al.add(new Student(1205, "IMRAN", 20));

        Collections.sort(al);

        Iterator<Student> itr = al.iterator();

        while (itr.hasNext()) {
            Student next = itr.next();
            System.out.println(next.roll + " " + next.name + " " + next.age);


        }
    }

}
