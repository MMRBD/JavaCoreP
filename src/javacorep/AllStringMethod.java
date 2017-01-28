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
public class AllStringMethod {

    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        connectWithString();
        System.out.println("Concat with string: " + (System.currentTimeMillis() - star)+" ms");
        star = System.currentTimeMillis();
        connectWithStringBuffer();
        System.out.println("Concat with stringBuffer: " + (System.currentTimeMillis() - star)+" ms");
        star = System.currentTimeMillis();
        connectWithStringBilder();
        System.out.println("Concat with stringBuilder: " + (System.currentTimeMillis() - star)+" ms");
    }

    static String connectWithString() {
        String s = "Cat";
        for (int i = 0; i < 1000; i++) {
            s = s.concat("Dog");
        }
        return s;
    }

    static String connectWithStringBuffer() {
        StringBuffer s = new StringBuffer("Cat");
        for (int i = 0; i < 1000; i++) {
            s.append("Dog");
        }
        return s.toString();
    }

    static String connectWithStringBilder() {
        StringBuilder s = new StringBuilder("Cat");
        for (int i = 0; i < 1000; i++) {
            s.append("Dog");
        }
        return s.toString();
    }

}
