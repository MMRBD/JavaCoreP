/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.*;


/**
 *
 * @author mokle
 */
public class Bank {

    
    
    public static void main(String[] args) {
        List <ABank> B = new LinkedList<>();
        ABank b1 = new ABank("MMR", "MR", 1205, 2500, 0);
        ABank b2 = new ABank("MMR", "MR", 1205, 2500, 0);
        ABank b3 = new ABank("MMR", "MR", 1205, 2500, 0);
        ABank b4 = new ABank("MMR", "MR", 1205, 2500, 0);
        
        B.add(b1);
        B.add(b2);
        B.add(b3);
        B.add(b4);
        
        Iterator<ABank> i = B.iterator();
        while (i.hasNext()) {            
            System.out.println(i.next());
        }
    }

}
class ABank{
    String n;
    String add;
    int an;
    int bal;
    int dept;

    public ABank(String n, String add, int an, int bal, int dept) {
        this.n = n;
        this.add = add;
        this.an = an;
        this.bal = bal;
        this.dept = dept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name of the customer: ");
        sb.append(this.n);
        sb.append(", ");
        sb.append("Address of the customer: ");
        sb.append(this.add);
        sb.append(", ");
        sb.append("A/O No: ");
        sb.append(this.an);
        sb.append(", ");
        sb.append("Balence os A/O: ");
        sb.append(this.bal);
        
        return sb.toString();
    }
}
