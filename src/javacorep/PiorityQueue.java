
package javacorep;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author mokle
 */
public class PiorityQueue {

    public static void main(String[] args) {
        String[] alphabet = {"A", "p", "MMR", "B", "Iabur", "Imran", "Z"};

        PriorityQueue pq = new PriorityQueue();
        for (int i = 0; i < alphabet.length; i++) {
            pq.add(alphabet[i]);
        }
        System.out.println(pq);
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(pq.poll());
        }

        System.out.println("Compare to Method");
        ForCompareMethod fcm = new ForCompareMethod();
        fcm.display();
    }

}

class ForCompareMethod {

    void display() {
        String[] alphabet = {"a", "p", "A", "P", "MMR", "B", "Iabur", "Imran", "Z"};

        PriorityQueue pq = new PriorityQueue(alphabet.length, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                return i.compareToIgnoreCase(j);
            }
        });

        for (int i = 0; i < alphabet.length; i++) {
            pq.offer(alphabet[i]);
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(pq.poll());
        }
    }
}
