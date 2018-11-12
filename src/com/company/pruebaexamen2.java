package com.company;

import java.util.Scanner;
public class pruebaexamen2 {

    public static void main(String[] args) {
        int contar=0;
        int num[] = new int[100];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <num.length ; i++) {
            num[i] = teclado.nextInt();

            if(num[i]==num[i]){
                contar++;
            }
            System.out.println(contar);
        }
    }
}

