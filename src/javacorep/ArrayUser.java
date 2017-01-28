/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.Scanner;

/**
 *
 * @author Moklesur
 * @version
 */
public class ArrayUser {

    static Scanner mySc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aSize, start, end, sum = 0;
        prln("Enter ArraySize");
        aSize = mySc.nextInt();
        int[] myArray = new int[aSize];

        prln("Enter Array Element: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = mySc.nextInt();
        }
        while (true) {
            prln("Enter Start point: ");
            start = mySc.nextInt();
            prln("Enter End point: ");
            end = mySc.nextInt();
            if (end <= start) {
                prln("Enter End Value Gratarthen Start Value.");
            } else {
                for (int i = start; i <= end; i++) {
                    sum += i;
                }
                prln("Your Sum is: " + sum);
            }
        }
    }

    /**
     * This Fun made by MMR
     *
     * @param aObject
     */
    static void prln(Object aObject) {
        System.out.println(aObject);
    }

}
