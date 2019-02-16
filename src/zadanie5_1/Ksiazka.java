/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie5_1;

import java.io.Serializable;

/**
 *
 * @author lesze
 */
public class Ksiazka implements Serializable {
    private int rokWydania;
    private String autor;
    private String tytul;
    private String gatunek;
    
    public Ksiazka(int rokWydania, String autor, String tytul, String gatunek) {
        this.rokWydania = rokWydania;
        this.autor = autor;
        this.tytul = tytul;
        this.gatunek = gatunek;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    
}
