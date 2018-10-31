package com.company;

import java.util.Scanner;

public class basic3 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        System.out.print("numero: ");
        int num1 = cifras.nextInt();
        int total;

        boolean var1=false;
        if (num1<=10 && num1>=1) {
            for (int i = 2; i < num1 - 1; i++) {
                if (num1 % i == 0) {
                    System.out.println("no es primo");
                    var1=true;
                    break;
                }
            }

            if (var1==false){
                System.out.println("es primo");
            }

        } else {
            System.out.println("ERROR");
        }
    }
}

