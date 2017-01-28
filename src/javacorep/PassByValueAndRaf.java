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
public class PassByValueAndRaf {
    
    int x = 50;
    
    void change(int x){
        this.x += x;
        System.out.println("Data: "+x);
        
        
    }
    void chnageObj(PassByValueAndRaf raf){
        raf.x = 500;
    }
    
    public static void main(String[] args) {
        PassByValueAndRaf p = new PassByValueAndRaf();
        System.out.println("Data: "+p.x);
        p.change(50);
        System.out.println("After Data: "+p.x);
        p.chnageObj(p);
        System.out.println("After after Data: "+p.x);
        
    }
    
}
