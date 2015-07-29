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
    Toiminta toiminta;

    public LaivastonLuominen() {
        this.arpoja=new Random();
    
        this.lauta = new int[10][10];
        this.toiminta = new Toiminta(lauta);
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

        int alkaaX = arpoja.nextInt(5);
        int alkaaY = arpoja.nextInt(5);
        int suunta = arpoja.nextInt(1);
        System.out.println(alkaaX + " " + alkaaY + " " + suunta);
//        if (suunta == 1) {//alaspäin
//            for (int i = alkaaY; i < alkaaY + 5; i++) {
//                lauta[i][alkaaX] = 1;
//               // toiminta.merkitseVierustat(lauta, i, alkaaX);
//            }
//        } else {
//            for (int i = alkaaX; i < alkaaX + 5; i++) {
//                lauta[i][alkaaY] = 1;
//              //  toiminta.merkitseVierustat(lauta, i, alkaaY);
//            }
//        }
    }

    public void nelosAlus() {
        // sitten kaksi 1x4:n kokoista
        int pituus = 0;
        while (pituus == 4) {
            int alkaaX = arpoja.nextInt(6);
            int alkaaY = arpoja.nextInt(6);
            int suunta = arpoja.nextInt(1);

            if (suunta == 1) {//alaspäin
                for (int i = alkaaY; i < alkaaY + 4; i++) {

                    if (toiminta.onkoVapaa(alkaaY, alkaaY) == true) {
                        pituus++;
                        lauta[i][alkaaX] = 1;
                    } else {
                        pituus = 0;
                    }
                    //uudestaan alusta, poistaa vanhemmat
                }
            } else {
                for (int i = alkaaX; i < alkaaX + 4; i++) {
                    if (toiminta.onkoVapaa(alkaaY, alkaaY) == true) {
                        pituus++;
                        lauta[alkaaY][i] = 1;
                    } else {
                        pituus = 0;
                    }
                        //uudestaan alusta

                }

            }// palautta oikein menneet
        }
    }
