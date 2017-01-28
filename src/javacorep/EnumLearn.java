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
public class EnumLearn {

    public enum Day {
        SAT, SUN, MON, WED, TUE, FRI();

    };

    public static void main(String[] args) {
        for (Day s : Day.values()) {
            System.out.println(s + " ");
        }
    }
}
