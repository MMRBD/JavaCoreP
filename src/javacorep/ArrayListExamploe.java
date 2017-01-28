/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mokle
 */
public class ArrayListExamploe {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Moklesur");
        list.add("Iabur");
        list.add("Imran");
        list.add("Tareq");
        list.add(2, "Shojib");

        System.out.println("ArrayList size: " + list.size() + " Element: " + list);

        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
        list.remove("Moklesur");
        list.remove(2);
        System.out.println("ArrayList size: " + list.size() + " Element: " + list);

        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
        
        System.out.println("Show with Ganaric: \n\n\n");
       ListOfArray loa = new ListOfArray();
       loa.showAll();

    }

}

class ListOfArray {

    void showAll() {
        ArrayList<String> al = new ArrayList();

        al.add("Moklesur");
        al.add("Iabur");
        al.add("Imran");
        al.add("Tareq");
        al.add(2, "Shojib");
        
        System.out.println("Show with ganarel loop: ");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        System.out.println("Show with Advance: ");
        for(String s: al){
            System.out.println(s);
        }
        System.out.println("Show with while: ");
        int j=0;
        while (al.size()>j) {            
            System.out.println(al.get(j));
            j++;
        }
        System.out.println("Show with Itarator: ");
        Iterator <String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
                
        
    }
}
