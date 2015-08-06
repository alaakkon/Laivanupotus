/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.laivanupotus;

/**
 *
 * @author alaakkon
 */
public class Toiminta {

    public int[][] pelilauta;
    int x;
    int y;

    public Toiminta(int[][] pelilauta) {
        this.pelilauta = pelilauta;
        this.x = x;
        this.y = y;

    }

    public int[][] haePelilauta() {
        return pelilauta;
    }

    public boolean onkoLaiva(int[][] lauta, int x, int y) {
        if (pelilauta[y][x] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onkoVapaa(int x, int y) {
        if (pelilauta[y][x] != 0) {
            return false;
        } else {
            return true;
        }
    }

    public int[][] merkitseVierustat(int[][] lauta, int x, int y) {
        boolean onko;
        if (x == 0) {
            if (y == 0) {// vasen yläkulma
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[j][i] = 2;
                        }
                    }
//                   
                }
            } else if (y == 9) { // oikea alakulma
                for (int i = 8; i < 10; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[i][j] = 2;
                        }
                    }

                }
            } else {// vasen reuna
                for (int i = y - 1; i <= y + 1; i++) {
                    for (int j = 0; j <= 1; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[i][j] = 2;
                        }
                    }
                }
            }
        } else if (x == 9) {
            if (y == 0) {//oikea yläkulma 
                for (int i = 9; i > 7; i--) {
                    for (int j = 0; j < 2; j++) {
                        if (onkoLaiva(lauta, i, j) == false) {
                            pelilauta[j][i] = 2;
                        }
                    }
                }
            } else if (y == 9) { // oikea alakulma
                for (int i = 9; i > 7; i--) {
                    for (int j = 9; j > 7; j--) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[j][i] = 2;
                        }
                    }
                }
//                if (onkoLaiva(x - 1, y) == false) {
//                    pelilauta[x - 1][y] = 2;
//
//                }
//                if (onkoLaiva(x - 1, y - 1) == false) {
//                    pelilauta[x - 1][y] = 2;
//                }
//                if (onkoLaiva(x, y - 1) == false) {
//                    pelilauta[x - 1][y] = 2;
//                }
            } else {// oikea reuna
                for (int i = y - 1; i <= y + 1; i++) {
                    for (int j = 8; j < 10; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[i][j] = 2;
                        }
                    }
                }
            }
        } else {
            if (y == 0) {//yläreuna
                for (int i = 0; i <= 1; i++) {
                    for (int j = x - 1; j <= x + 1; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[j][i] = 2;
                        }
                    }
                }
            }
            if (y == 9) {//alareuna
                for (int i = 8; i < 10; i++) {
                    for (int j = x - 1; j <= x + 1; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[i][j] = 2;
                        }
                    }
                }
            } else {//ei reunoilla
                for (int i = y - 1; i <= y + 1; i++) {
                    for (int j = x - 1; j <= x + 1; j++) {
                        if (onkoLaiva(lauta, j, i) == false) {
                            pelilauta[i][j] = 2;
                        }
                    }
                }
            }

        }
    
    return pelilauta ;
}

public void tulostaLauta(int[][] lauta) {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(lauta[i][j]);
            }
        }
    }
}
