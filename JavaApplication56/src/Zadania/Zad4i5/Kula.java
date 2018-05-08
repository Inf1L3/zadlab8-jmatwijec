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
public class Kula extends FiguraPrzestrzenna {
        private float r;

    public Kula(float r) {
        this.r = r;
    }
         @Override
        public float obliczObjetosc() {
        return (float) (1.3*r*r*r*PI); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return (float) (PI*r*r*4); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
     public String toString(){
        return super.toString()+"kula"+r+" Pole="+obliczPole()+"obj: "+obliczObjetosc() ;
    }
    
}
