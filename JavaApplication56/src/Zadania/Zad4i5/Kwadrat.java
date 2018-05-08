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
public class Kwadrat extends FiguraPlaska {
    private float bok;

    public Kwadrat(float bok) {
        this.bok = bok;
    }
    
    @Override
    public float bliczObwod() {
        return 4*bok;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float obliczPole() {
        return bok*bok; //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public String toString(){
        return super.toString()+"Kwadrat bok:"+bok+" Pole="+obliczPole()+"obowod: "+bliczObwod() ;
    }
}
