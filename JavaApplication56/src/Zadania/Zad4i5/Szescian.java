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
public class Szescian extends FiguraPrzestrzenna {
    private float a;

    public Szescian(float a) {
        this.a = a;
    }
    
    @Override
    public float obliczObjetosc() {
        return a*a*a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return 6* a * a; //To change body of generated methods, choose Tools | Templates.
    }
        @Override
     public String toString(){
        return super.toString()+"Szescian "+a+" Pole="+obliczPole()+"obj: "+obliczObjetosc() ;
    }
    
}
