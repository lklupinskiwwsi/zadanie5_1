/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie5_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lesze
 */
public class Zadanie5_1 {
    
     static   void  zapis(List<Ksiazka> ksiazki) throws FileNotFoundException, IOException
    {
    FileOutputStream p1 = new
          FileOutputStream("dane.txt");
      ObjectOutputStream s = new
          ObjectOutputStream(p1);

    s.writeObject(ksiazki);
      
    s.close();
      
    }
      
 
 static   List<Ksiazka>  odczyt() throws FileNotFoundException, IOException, ClassNotFoundException
 {
 FileInputStream p2 = new
       FileInputStream("dane.txt");
   ObjectInputStream s = new
       ObjectInputStream(p2);

 List<Ksiazka> ksiazki = (List<Ksiazka>) s.readObject();
 
 return ksiazki;
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Ksiazka> ksiazki;
        ksiazki = new ArrayList<Ksiazka>();
        
        ksiazki.add(new Ksiazka(1961, "J.R.R. Tolkiena", "Drużyna Pierścienia", "fantastyka"));
        ksiazki.add(new Ksiazka(2015, "Paula Hawkins", "Dziewczyna z pociągu", "thriller"));
        ksiazki.add(new Ksiazka(2016, "Nick Bostrom", "Superinteligencja", "nauka"));
        ksiazki.add(new Ksiazka(1997, "J.K. Rowling", "Harry Potter i Kamień Filozoficzny", "fantastyka"));
        
         try {
             zapis(ksiazki);
         } catch (IOException ex) {
             Logger.getLogger(Zadanie5_1.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         try {
             ksiazki = odczyt();
         } catch (IOException ex) {
             Logger.getLogger(Zadanie5_1.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Zadanie5_1.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         for (Ksiazka object: ksiazki) {
             System.out.println("tytuł: " + object.getTytul() + ", autor: " + object.getAutor() + ", rok wydania: " + object.getRokWydania() + ", gatunek: " + object.getGatunek());
         }
        
    }
    
}
