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
public class Prostokat extends FiguraPlaska{
    private float a,b;

    public Prostokat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float bliczObwod() {
        return 2*a+2*b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return a*b; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
        public String toString(){
        return super.toString()+"Prostokat: "+a+" "+b+"Pole="+obliczPole()+bliczObwod() ;
    }
    
}
