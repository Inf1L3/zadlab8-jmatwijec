/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadania.Zad4i5;

/**
 *
 * @author Kuba
 */
public class Prostopaloscian  extends FiguraPrzestrzenna{
    private float a,b,c;

    public Prostopaloscian(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
        public float obliczObjetosc() {
        return a*b*c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return 2* a * b+2*b*c+2*a*c; //To change body of generated methods, choose Tools | Templates.
    }
        @Override
     public String toString(){
        return super.toString()+"Prostopaloscian: "+a+" " + b+ "" +c+" Pole="+obliczPole()+"obj: "+obliczObjetosc() ;
    }
    
}
