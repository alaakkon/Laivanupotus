package laivanupotus.laivanupotus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import laivanupotus.laivanupotus.LaivastonLuominen;
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
public class LaivastonLuominenTest {
    LaivastonLuominen l;
    
    public LaivastonLuominenTest() {
        this.l=new LaivastonLuominen();
    }
    
   public int tutkiKoko(int[][] l){
       int koko=0;
       for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (l[i][j] !=0) {
                    koko++;
                }
            }
        }return koko;
   }

     @Test
     public void luokoViitoslaivanKoonOikein() {
        l.vitosAlus();
        assertEquals(tutkiKoko(l.haePelilauta()),5);
     }
}
