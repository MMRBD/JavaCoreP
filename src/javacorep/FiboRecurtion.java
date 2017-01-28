/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import javax.swing.JOptionPane;

/**
 *
 * @author mokle
 */
public class FiboRecurtion {

    public static void main(String[] args) {
        int input =Integer.parseInt(JOptionPane.showInputDialog("Enter N: "));
        
        for (int i = 1; i <= input; i++) {
            int f = fibo(i);
            System.out.println("fibo("+i+") = "+f);
        }
    }

    static int fibo(int a) {
        if (a <= 2) {
            return 1;
        } else {
            return fibo(a - 1) + fibo(a - 2);
        }
    }

}
