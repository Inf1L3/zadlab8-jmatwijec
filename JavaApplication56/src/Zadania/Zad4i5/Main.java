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
public class Main {

    public static void main(String[] args) {
        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];
        figury[0] = new Trapez(10, 15, 13, 11, 2);
        figury[1] = new Stozek(6, 10, 12);
        figury[2] = new Kula(3);
        figury[3] = new Prostokat(6, 8);
        figury[4] = new Kolo(13);
        figury[5] = new Szescian(10);
        figury[6] = new Rownoleglobok(33, 4, 14, 15);
        figury[7] = new Prostopaloscian(34, 3, 5);
        figury[8] = new Szescian(32);
        figury[9] = new Kwadrat(10);
        figury[10] = new Trojkat(12, 23, 11, 15);
        figury[11] = new Kula(2);
        figury[12] = new Kolo(1);
        figury[13] = new Walec(7, 5);
        figury[14] = new Szescian(30);
        int li = 0;
        System.out.println("test");
        //Pokazuje klase abstrakcyjna co dzieciczymy np. Obliczanie figury plaskiej; oraz to dodałem speccjalne jej paremetry
        while (li < 15) {
            System.out.println(figury[li].toString());
            li++;
        }
    }

}
