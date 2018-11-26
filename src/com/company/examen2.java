package com.company;

import java.util.Scanner;

public class examen2 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        int num1 = cifras.nextInt();
        int num2 = cifras.nextInt();
        int num3 = cifras.nextInt();
        int num4 = cifras.nextInt();

        int total=1;

        if (num1==num2) {
            total++;

            if (num2==num3){
                total++;
            } else if (num3==num4){
                total++;
            } else {
                System.out.println("0");
            }

        }
        System.out.println(total);
    }
}

