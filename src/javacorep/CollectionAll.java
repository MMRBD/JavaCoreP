
package javacorep;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author mokle
 */
public class CollectionAll {

    public static void main(String[] args) {
        List l = new LinkedList();
        System.out.println("List Class:");
        l.add("Moklesur");
        l.add("Iabur");
        l.add("Imran");
        l.add("TaraQ");
        l.add("Moklesur");
        printC(l);
        
        System.out.println("Set Class:");
        Set s = new HashSet();
        s.add("Moklesur");
        s.add("Iabur");
        s.add("Imran");
        s.add("TaraQ");
        s.add("Moklesur");
        printC(s);
        
        System.out.println("Sorted set with tree set: ");
        SortedSet ss = new TreeSet();
        ss.add("Moklesur");
        ss.add("Iabur");
        ss.add("Imran");
        ss.add("TaraQ");
        ss.add("Moklesur");
        printC(ss);
        
        System.out.println("Linked Has set: ");
        LinkedHashSet lHS = new LinkedHashSet();
        lHS.add("Moklesur");
        lHS.add("Iabur");
        lHS.add("Imran");
        lHS.add("TaraQ");
        lHS.add("Moklesur");
        printC(lHS);
        
        System.out.println("Map: ");
        Map m = new HashMap();
        m.put("mmr","Moklesur");
        m.put("ibr","Iabur");
        m.put("imrn","Imran");
        m.put("trq","TaraQ");
        m.put("mmr","Moklesur");
        printC(m.keySet());
        printC(m.values());
        
        System.out.println("Sorted Map: ");
        SortedMap sm = new TreeMap();
        sm.put("mmr","Moklesur");
        sm.put("ibr","Iabur");
        sm.put("imrn","Imran");
        sm.put("trq","TaraQ");
        sm.put("mmr","Moklesur");
        printC(sm.keySet());
        printC(sm.values());
        
        System.out.println("Linked Hash Map: ");
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("mmr","Moklesur");
        lhm.put("ibr","Iabur");
        lhm.put("imrn","Imran");
        lhm.put("trq","TaraQ");
        lhm.put("mmr","Moklesur");
        printC(lhm.keySet());
        printC(lhm.values());
        
        

    }

    static void printC(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s + " ");

        }
        System.out.println();
    }

}
