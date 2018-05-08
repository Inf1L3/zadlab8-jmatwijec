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
public class Stozek extends FiguraPrzestrzenna{

    private float r, h, l;

    public Stozek(float r, float h, float l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }
 @Override
    public float obliczObjetosc() {
        return (float) (0.33 * r * r * PI * h); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public float obliczPole() {
        return (float) (PI * r * (l + r)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() +"Stozek:"+r+" "+h+ " " +l+" Pole=" + obliczPole() + "obj: " + obliczObjetosc();
    }
}
