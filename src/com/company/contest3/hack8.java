package com.company.contest3;

import java.util.Scanner;

public class hack8 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int columnas=tec.nextInt();
        int filas=tec.nextInt();
        int[][] tablero = new int[columnas][filas];

        for (int i = 0; i <columnas ; i++) {
            for (int j = 0; j <filas ; j++) {
                tablero[i][j]=tec.nextInt();
            }
        }

        int columna=tec.nextInt()-1, fila=tec.nextInt()-1;

        do {
            if(tablero[columna][fila]==1){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            columna=tec.nextInt()-1;
            fila=tec.nextInt()-1;
        } while (columna+1!=0 && fila+1!=0);
    }
}