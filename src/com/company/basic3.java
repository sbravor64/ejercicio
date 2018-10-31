package com.company;

import java.util.Scanner;

public class basic3 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        System.out.print("numero: ");
        int num1 = cifras.nextInt();
        int total;
        if (num1<=10 && num1>=1){

            if(num1%2 == 0){
                System.out.println("NO es un número primo "+ num1);
            }
            else {
                System.out.println("Es un número primo "+ num1);
            }
        } else {
            System.out.println("ERROR");
        }


    }
}

