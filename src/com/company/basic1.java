package com.company;

import java.util.Scanner;

public class basic1 {

    public static void main(String[] args) {

        Scanner año = new Scanner(System.in);
        System.out.print("AÑO: ");
        int year = año.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 4 == 0){
                System.out.println("es bisiesto");
            } else {
                System.out.println("es bisiesto");
            }

        } else {
            System.out.println("no es bisiesto");
        }
    }
}

