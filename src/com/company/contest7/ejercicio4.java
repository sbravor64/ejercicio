package com.company.contest7;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int Bi,Bj, Ni, Nj;
        char [][] matriz = new char[8][8];

        for (int i = 0; i <matriz.length ; i++) {
            String juego = tec.nextLine();
            for (int j = 0; j <matriz[i].length ; j++) {
                char carac = juego.charAt(j);
                matriz [i][j]= carac;

                if(matriz [i][j]=='B'){
                    Bi=i;
                    Bj=j;
                } else if(matriz [i][j]=='N'){
                    Ni=i;
                    Nj=j;
                }
            }
        }




    }
}

