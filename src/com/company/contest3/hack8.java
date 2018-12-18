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

        //for (int i = 0; i <columnas ; i++) {
        //    for (int j = 0; j <filas ; j++) {
        //        System.out.print(tablero[i][j]+" ");
        //    }
        //    System.out.println(" ");
        //}

        int columna=tec.nextInt(), fila=tec.nextInt();

        while (columna!=0 && fila!=0){
            for (int i = 0; i <columnas ; i++) {
                for (int j = 0; j <filas ; j++) {
                    if(tablero[i][j]==1){
                        System.out.println("SI");
                    }
                }
            }
            columna=tec.nextInt();
            fila=tec.nextInt();
        }
    }
}