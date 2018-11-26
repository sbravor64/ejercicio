package com.company;

import java.util.Scanner;

public class ejerciciohack2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int numt = tec.nextInt();
        int num;
        int numant = 0;
        int cont=0;
        int contt=0;

        if (numt==0){
            System.out.println("0");
        } else if (numt>=0 || numt<=100){
            while (numt!=contt) {
                num=tec.nextInt();
                while (num > 0) {
                    numant = num;
                    num = tec.nextInt();

                    if (num != numant || num==numant) {
                        cont++;
                    }
                }
                System.out.println(cont);
                contt++;
                cont=0;
            }
        }
    }
}