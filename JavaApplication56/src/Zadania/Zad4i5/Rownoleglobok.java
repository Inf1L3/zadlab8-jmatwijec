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
public class Rownoleglobok  extends FiguraPlaska{
    private float a,b,c,d;

    public Rownoleglobok(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
            @Override
    public float bliczObwod() {
        return a+b+c+d; //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public float obliczPole() {
        return (float) a*b;//To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public String toString(){
        return super.toString()+"Rownoleglobok:"+a+" "+b+ " " +c+" Pole="+obliczPole()+"obowod: "+bliczObwod() ;
    }
}
