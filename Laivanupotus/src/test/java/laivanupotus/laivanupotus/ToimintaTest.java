package laivanupotus.laivanupotus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import laivanupotus.laivanupotus.LaivastonLuominen;
import laivanupotus.laivanupotus.Toiminta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alaakkon
 */
public class ToimintaTest {

    LaivastonLuominen l;
    public int[][] pelilauta;
    Toiminta t = new Toiminta(pelilauta);

    public ToimintaTest() {

        this.l = new LaivastonLuominen();
        this.pelilauta = l.haePelilauta();
    }

    public boolean vertaile(int[][] lauta1, int[][] lauta2) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (lauta1[i][j] != lauta2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void hakeekoPelilaudanOikein() {
        int[][] u = new int[10][10];

        assertEquals(vertaile(pelilauta, u), true);

    }

    @Test
    public void onkoLaivaOikein() {
        //int[][] u = new int[10][10];
        pelilauta[1][1] = 1;
        Toiminta t2 = new Toiminta(pelilauta);

        assertEquals(t2.onkoLaiva(pelilauta, 1, 1), true);
        assertEquals(t2.onkoLaiva(pelilauta, 1, 2), false);

    }

    @Test
    public void onkoVapaaOikein() {
        //int[][] u = new int[10][10];
        pelilauta[1][1] = 1;
        Toiminta t2 = new Toiminta(pelilauta);

        assertEquals(t2.onkoVapaa(1, 1), false);
        assertEquals(t2.onkoVapaa(3, 2), true);

    }

    @Test
    public void merkitseekoVierustatOikeinVasemmassaYlakulmassa() {
        //int[][] u = new int[10][10];
        pelilauta[0][0] = 1;
        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 0, 0);
        //pelilauta=t2.haePelilauta();
        assertEquals(2, pelilauta[0][1]);
        assertEquals(2, pelilauta[1][1]);
        assertEquals(2, pelilauta[1][0]);

    }

    @Test
    public void merkitseekoVierustatOikeinOikeassaYlakulmassa() {
        //int[][] u = new int[10][10];
        pelilauta[9][9] = 1;
        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 9, 9);
        //pelilauta=t2.haePelilauta();
        assertEquals(2, pelilauta[8][9]);
        assertEquals(2, pelilauta[8][8]);
        assertEquals(2, pelilauta[9][8]);

    }

    @Test
    public void merkitseekoVierustatOikeinVasemmassaReunassa() {

        pelilauta[2][0] = 1;

        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 0, 2);

        assertEquals(2, pelilauta[1][0]);
        assertEquals(2, pelilauta[1][1]);
        assertEquals(2, pelilauta[2][1]);
        assertEquals(2, pelilauta[3][1]);
        assertEquals(2, pelilauta[3][0]);

    }

    @Test
    public void merkitseekoVierustatOikeinOikeassaAlakulmassa() {

        pelilauta[9][9] = 1;

        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 9, 9);

        assertEquals(2, pelilauta[9][8]);
        assertEquals(2, pelilauta[8][8]);
        assertEquals(2, pelilauta[8][9]);
        assertEquals(1, pelilauta[9][9]);

    
} @Test
    public void merkitseekoVierustatOikeinVasemmassaAlakulmassa() {

        pelilauta[9][0] = 1;

        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 0, 9);

        assertEquals(2, pelilauta[8][0]);
        assertEquals(2, pelilauta[8][1]);
        assertEquals(2, pelilauta[9][1]);
        assertEquals(1, pelilauta[9][0]);

    }@Test
    public void merkitseekoVierustatOikeinAlarivissa() {

        pelilauta[9][3] = 1;

        Toiminta t2 = new Toiminta(pelilauta);
        pelilauta = t2.merkitseVierustat(pelilauta, 3, 9);

        assertEquals(2, pelilauta[8][2]);
        assertEquals(2, pelilauta[8][3]);
        assertEquals(2, pelilauta[8][4]);
        assertEquals(2, pelilauta[9][4]);
        assertEquals(2, pelilauta[9][2]);
        assertEquals(1, pelilauta[9][3]);

    }
}