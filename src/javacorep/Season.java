/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

import javax.crypto.SealedObject;

/**
 *
 * @author mokle
 */
class EnumExample {

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value+" "+s.displaySeason());
        }
    }
}

public enum Season {
    SUMMER(10) {
        @Override
        public String displaySeason() {
            return "Summer";//To change body of generated methods, choose Tools | Templates.
        }
    }, WINTER(20) {
        @Override
        public String displaySeason() {
            return "Winter"; //To change body of generated methods, choose Tools | Templates.
        }
    };

    public int value;

    Season(int value) {
        this.value = value;
    }
    
    public abstract String displaySeason();

}
