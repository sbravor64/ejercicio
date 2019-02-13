package com.company.EXAMEN;

import java.util.Scanner;

public class basic4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cont1=0,cont2=0;
        int columnas=tec.nextInt();
        int filas=tec.nextInt();
        int[][] tablero1 = new int[columnas][filas];
        int[][] tablero2 = new int[columnas][filas];

        for (int i = 0; i <columnas ; i++) {
            for (int j = 0; j <filas ; j++) {
                tablero1[i][j]=tec.nextInt();
            }
        }

        for (int i = 0; i <columnas ; i++) {
            for (int j = 0; j <filas ; j++) {
                tablero2[i][j]=tec.nextInt();
            }
        }
        
        int cant =tec.nextInt();

        for (int i = 0; i <cant ; i++) {
            int f=tec.nextInt();
            int c=tec.nextInt();
            if(tablero2[f-1][c-1]==1){
                cont1++;
            }
        }


        for (int i = 0; i <cant ; i++) {
            int f=tec.nextInt();
            int c=tec.nextInt();
            if(tablero1[f-1][c-1]==1){
                cont2++;
            }
        }

        if(cont1>cont2){
            System.out.println("player1");
        } else if(cont2>cont1){
            System.out.println("player2");
        } else{
            System.out.println("tie");
        }

        
    }
}

