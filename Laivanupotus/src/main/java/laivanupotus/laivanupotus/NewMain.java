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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LaivastonLuominen u = new LaivastonLuominen();

        Toiminta t = new Toiminta(u.haePelilauta());
        int[][] l = t.haePelilauta();
        l[0][5]=1;
       
        t.tulostaLauta(l);
       System.out.println("");
        t.merkitseVierustat(l, 5, 0);
        l=t.haePelilauta();
                t.tulostaLauta(l);
   

    }
}
