/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.Comparator;

/**
 *
 * @author mokle
 */
public class AgeComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        AnotherStudent s1 = (AnotherStudent) obj1;
        AnotherStudent s2 = (AnotherStudent) obj2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        }else{
            return -1;
        }
    }

}
