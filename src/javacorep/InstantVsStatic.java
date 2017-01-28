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
public class InstantVsStatic {

    static {
        System.out.println("Class Loading...");
    }
    //constant 
    static final long ONE_DAY_IN_MILIS = 24 * 60 * 60 * 1000;

    //a static fild..
    static int instantCounter;

    static {
        System.out.println("ONE_DAY_IN_MILIS = " + ONE_DAY_IN_MILIS + "\nInstantcounter = " + instantCounter);
    }

    {
        InstantVsStatic.instantCounter++;
        System.out.println("InstantCounter = " + instantCounter);
    }

    public static void main(String[] args) {
        System.out.println("");

        new InstantVsStatic();  //Anonimas OBJ
        new InstantVsStatic();
        new InstantVsStatic();
        System.out.println("InstantCounter in main = " + instantCounter);
    }

    static {
        System.out.println("Instant is Loded..");
    }

}
