/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.laivanupotus;

import java.util.Random;

/**
 *
 * @author alaakkon
 */
public class Pelilauta {

    Random arpoja;
    int[][] lauta;

    public Pelilauta(int[][] lauta) {
        this.lauta = new int[10][10];
    }

    public int[][] uusiPelilauta() {
        vitosAlus();
        nelosAlus();
        nelosAlus();
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
        System.out.println(suunta);
        if (suunta == 1) {//alaspäin
            for (int i = alkaaY; i < alkaaY + 5; i++) {
                lauta[i][alkaaX] = 1;
            }
        } else {
            for (int i = alkaaX; i < alkaaX + 5; i++) {
                lauta[i][alkaaY] = 1;
            }
        }
    }

    public void nelosAlus() {
        // sitten kaksi 1x4:n kokoista

        int alkaaX = arpoja.nextInt(6);
        int alkaaY = arpoja.nextInt(6);

        while (lauta[alkaaY][alkaaX] != 1) {// tämä uusisksi

            alkaaX = arpoja.nextInt(6);
            alkaaY = arpoja.nextInt(6);

        }
        int suunta = arpoja.nextInt(1);
        System.out.println(suunta);
        if (suunta == 1) {//alaspäin
            for (int i = alkaaY; i < alkaaY + 4; i++) {
                lauta[i][alkaaX] = 1;
            }
        } else {
            for (int i = alkaaX; i < alkaaX + 4; i++) {
                lauta[i][alkaaY] = 1;
            }

        }
    }
}

