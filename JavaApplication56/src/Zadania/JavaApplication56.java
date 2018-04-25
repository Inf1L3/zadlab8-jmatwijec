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
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              System.out.println("tssdet");
        Product[] tab = new Product[10];
        tab[0]= new Book(1,"asd","sad");
        tab[1]= new Chocolate(1,"asd","sad");
        tab[2]= new Book(1,"asd","sad");
        tab[3]= new Pen(1,"asd","sad");
        tab[4]= new Jam(1,"asd","sad");
        tab[5]= new Aspirin(1,"asd","sad");
         tab[6]= new Jam(1,"asd","sad");
         tab[7]= new Chocolate(1,"asd","sad");
      tab[8]= new Pen(1,"asd","sad");
      tab[9]= new Book(1,"asd","sad");

         for(int i=0;i<10;i++){
             tab[i].buy();
             tab[i].showInfo();
         }
        // TODO code application logic here
    }
    
}
