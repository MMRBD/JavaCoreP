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
public class VarArg {

    public static void main(String[] args) {
        fun(1250, "Bangladesh", "Japan", "Indea");
        fun(1250, "Bangladesh", "Japan", "Indea", "Austrolia");
        fun(1250, "Bangladesh", "Japan", "Indea", "Japan", "Bangladesh", "Indewa");
    }

    static void fun(int a, String... arg) {
        System.out.print("\n" + a);
        for (String s : arg) {
            System.out.print(", " + s);
        }
    }
}
