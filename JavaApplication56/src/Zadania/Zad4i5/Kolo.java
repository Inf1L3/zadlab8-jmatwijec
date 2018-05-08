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
public class Kolo extends FiguraPlaska {
    private float r;

    public Kolo(float r) {
        this.r = r;
    }
    
                @Override
    public float bliczObwod() {
        return (float) (2*PI*r); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public float obliczPole() {
        return (float) ((float) r*r*PI);//To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public String toString(){
        return super.toString()+"Kolo:"+r+" Pole="+obliczPole()+"obowod: "+bliczObwod() ;
    }
}
