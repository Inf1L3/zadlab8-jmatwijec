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
public class Trojkat extends FiguraPlaska {
    private float a,b,c,h;

    @Override
    public float bliczObwod() {
        return a+b+c; //To change body of generated methods, choose Tools | Templates.
    }

    public Trojkat(float a, float b, float c, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public float obliczPole() {
        return (float) (0.5*a*h);//To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public String toString(){
        return super.toString()+"Trojkat:"+a+" "+b+ " " +c+" Pole="+obliczPole()+"obowod: "+bliczObwod() ;
    }
    
}
