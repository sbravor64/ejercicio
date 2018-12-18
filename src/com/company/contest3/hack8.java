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

        int columna=1, fila=1;

        while (columna!=0 && fila!=0){
            columna=tec.nextInt()-1;
            columna=tec.nextInt()-1;
            if(tablero[columna][fila]==1){
                System.out.println("SI");
            }
        }
    }
}