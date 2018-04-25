/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadania;

/**
 *
 * @author student
 */
public class Book extends Product{

    public Book() {
    }

    public Book(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("b Book"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInfo() {
       System.out.println("Book");//To change body of generated methods, choose Tools | Templates.
    }
    
}
