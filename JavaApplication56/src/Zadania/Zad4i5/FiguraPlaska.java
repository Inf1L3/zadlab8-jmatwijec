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
public abstract class FiguraPlaska extends FiguraGeometryczna{
    public abstract float bliczObwod();
    @Override
    public String toString(){
        return "\"Obliczanie parametrów figury płaskiej\"";
    }
}
