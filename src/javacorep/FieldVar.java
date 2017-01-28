/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import java.util.Date;

/**
 *
 * @author mokle
 */
public class FieldVar {

    double d;
        Date date = new Date();
        String s;

    public FieldVar(String s) {
        this.s = s;
    }
        
    
    public static void main(String[] args) {
        FieldVar fv = new FieldVar("Hello");
        
        System.out.println(fv.d);
        System.out.println(fv.date);
        System.out.println(fv.s);
    }

}
