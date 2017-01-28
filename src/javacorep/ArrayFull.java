/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

/**
 *
 * @author mokle
 */
public class ArrayFull {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray = new int[101];
        myArray[0] = 100;
        myArray[1] = 200;
        System.out.println("Position 0: " + myArray[0] + " Position 1: " + myArray[1]);
        /**
         * Printing the myArray1 Array...//
         */
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " ");
        }
        System.out.println();
        Account[] myAccount = new Account[2];
        myAccount[0] = new Account(1205, "MMR");
        myAccount[1] = new Account(1206, "MMR1");

        myAccount[0].showData();

    }

}

class Account {

    private final int id;
    private final String name;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void showData() {
        System.out.println("Account ID: " + id + "\nAccount Name: " + name);
    }
}
