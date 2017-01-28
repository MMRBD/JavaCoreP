package javacorep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mokle
 */
public class Genric {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("MMR");
        l.add("Imran");
        l.add("Iabur");
        l.add("Tareq");
        l.add(12);

        l.forEach((s) -> {
            System.out.println(s);
        });

        List<String> list = new ArrayList<>();
        list.add("Moklesur");
        list.add("Ko");
        list.add("Ba");
        list.add("Ma");
        list.add("12");
        list.forEach((s) -> {
            System.out.println(s);
        });
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("Start UnBound: ");
        unBoundWildcard(list1);
        unBoundWildcard(list);
    }
    static void unBoundWildcard(List<?> element){
        for(Object o: element){
            System.out.println(o);
        }
    }

}
