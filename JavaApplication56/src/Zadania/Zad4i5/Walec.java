/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadania.Zad4i5;

import static java.lang.Math.PI;

/**
 *
 * @author Kuba
 */
public class Walec extends FiguraPrzestrzenna {
    private float r,h;

    public Walec(float r, float h) {
        this.r = r;
        this.h = h;
    }
     @Override
            public float obliczObjetosc() {
        return (float) (r*r*PI*h); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return (float) (2*PI*r*(r+h)); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
     public String toString(){
        return super.toString()+"Walec:"+r+" "+h+" Pole="+obliczPole()+"obj: "+obliczObjetosc() ;
    }
    
}
