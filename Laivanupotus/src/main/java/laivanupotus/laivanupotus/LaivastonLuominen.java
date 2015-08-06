/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.laivanupotus;

import java.util.Random;

public class LaivastonLuominen {

    Random arpoja;
    int[][] lauta;
    int[][] l;
    Toiminta toiminta;

    public LaivastonLuominen() {
        this.arpoja=new Random();
    
        this.lauta = new int[10][10];
        this.toiminta = new Toiminta(l);
        this.l=new int[10][10];
    }

    public int[][] uusiPelilauta() {
        vitosAlus();

//        nelosAlus();
//        nelosAlus();
        return lauta;
    }

    public int[][] haePelilauta() {
        return lauta;
    }

    //arvotaan alusten paikat 
    public void vitosAlus() {

        int alkaaX = arpoja.nextInt(6);
        int alkaaY = arpoja.nextInt(6);
        int suunta = arpoja.nextInt(2);
        System.out.println(suunta);
//        System.out.println(alkaaX + " " + alkaaY + " " + suunta);
        if (suunta == 1) {//alaspäin
            for (int i = alkaaY; i < alkaaY + 5; i++) {
                lauta[i][alkaaX] = 1;
               // toiminta.merkitseVierustat(lauta, i, alkaaX);
            }
        } else {
            for (int i = alkaaX; i < alkaaX + 5; i++) {
                lauta[alkaaY][i] = 1;
              //  toiminta.merkitseVierustat(lauta, i, alkaaY);
            }
        }
    }

    public void nelosAlus() {
        // sitten kaksi 1x4:n kokoista
        
        l=haePelilauta();
        int pituus = 0;
        while (pituus == 4) {
//            int alkaaX = arpoja.nextInt(7);
//            int alkaaY = arpoja.nextInt(7);
//            int suunta = arpoja.nextInt(2);
            int alkaaX = 0;
            int alkaaY = 0;
            int suunta = 1;

            if (suunta == 1) {//alaspäin
                for (int i = alkaaY; i < alkaaY + 4; i++) {

                    if (toiminta.onkoVapaa(i, alkaaX) == true) {
                        pituus++;
                        l[i][alkaaX] = 1;
                        System.out.println("jep");
                       
                    } else {
                        pituus = 0;
                        l=lauta;
                    }
                  lauta=l;
                }
            } else {
                for (int i = alkaaX; i < alkaaX + 4; i++) {
                    if (toiminta.onkoVapaa(alkaaY, alkaaY) == true) {
                        pituus++;
                        l[alkaaY][i] = 1; System.out.println(pituus);
                    } else {
                        pituus = 0;
                        l=lauta;
                    }
                         lauta=l; //uudestaan alusta

                }

            }// palauttaa oikein menneet
            
        }
    }
}