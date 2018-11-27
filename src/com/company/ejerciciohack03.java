package com.company;

import java.util.Scanner;

public class ejerciciohack03 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total=tec.nextInt();
        int numdd=0;

        if (num==0 && numd==1 && total==0){
            System.out.println("SI");
        } else if (num+numd==total){
            numdd=tec.nextInt();
            if (numdd==0){
                System.out.println("SI");
            } while (numd+total==numdd && numdd!=0) {
                numant = total;
                numd = numdd;
                total = tec.nextInt();
                numdd=tec.nextInt();
                if(numant+numd==total && numdd==0){
                    System.out.println("SI");
                    return;
                } else if (numant+numd==total && numdd!=0 && numd+total==numdd){
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("NO");
        }

    }
}