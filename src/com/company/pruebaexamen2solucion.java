package com.company;

import java.util.Scanner;

public class pruebaexamen2solucion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int num_anterior = 0;
        int contar = 0;
        num=teclado.nextInt();
        do {
            num_anterior=teclado.nextInt();
            if (num != num_anterior) {
                contar=1;
            } else if (num == num_anterior) {
                contar++;
            }

        } while (num !=0);
        System.out.println(contar);
    }
}

