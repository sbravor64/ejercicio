package com.company;

import java.util.Scanner;

public class ejerciciohack2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int numt = tec.nextInt();
        int num = tec.nextInt();
        int numant = 0;
        int cont=0;
        int contt=0;

        if (numt>=0 || numt<=100){
            while (numt!=contt) {

                while (num != 0) {
                    numant = num;
                    num = tec.nextInt();

                    if (num != numant) {
                        cont++;
                    }
                }
                contt++;
            }
        }

        System.out.println(cont);
    }
}

