package com.company;

import java.util.Scanner;

public class ejerciciohack3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total;

        if (num==0 && numd==1){
            numant = tec.nextInt();
            num=tec.nextInt();
            total = tec.nextInt();
            while(total>=1) {
                if (numant + num == total) {
                    System.out.println("SI");
                }
                numant = num;
                num=total;
                total = tec.nextInt();
            }
        }

    }
}