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
public class NameComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        AnotherStudent s1 = (AnotherStudent) obj1;
        AnotherStudent s2 = (AnotherStudent) obj2;
        
        return s1.name.compareTo(s2.name);

    }

}
