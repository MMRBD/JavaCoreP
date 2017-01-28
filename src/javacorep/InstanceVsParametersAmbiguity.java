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
public class InstanceVsParametersAmbiguity {

    int x;
    String y;

    public InstanceVsParametersAmbiguity(int x, String y) {
        this.x = x;
        this.y = y;
    }

    void doYY(String[] args) {

    }

    void main(String[] args) {
        Some s = new Some();
        s.doXX(this);
    }
}

class Some {

    void doXX(InstanceVsParametersAmbiguity is) {
        is.x =10;
    }

}
