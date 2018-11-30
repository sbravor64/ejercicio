package com.company;

import java.util.Scanner;

public class ejerciciohack6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd=0;
        int numf=0;

        if (num<10000000){
            while (num!=numd){
                numd=tec.nextInt();
                numf=tec.nextInt();
                if (numf==0){
                    break;
                }
            }

            if(num==numd || numd==0){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }


    }
}