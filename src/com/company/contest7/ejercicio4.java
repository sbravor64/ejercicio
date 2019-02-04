package com.company.contest7;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String juego = tec.nextLine();
        String [][] matriz = new String[8][8];

        for (int i = 0; i <=8 ; i++) {
            for (int j = 0; j <=8 ; j++) {
                char carac=juego.charAt(j);

                System.out.print(matriz[i][j]);
            }
        }
    }
}

