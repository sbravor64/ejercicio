package com.company;

import java.util.Scanner;

public class ejerciciohack3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numant;
        int cont=0;

        if(num>=0){
            while(num!=0){
                if (num % 7 == 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
                num= tec.nextInt();
            }
        }
    }
}