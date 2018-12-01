package com.company;

import java.util.Scanner;

public class ejerciciohack6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd= tec.nextInt();
        int numf=0;

        if (numd!=0) {
            while (num != 0) {
                if (numd == 0) {
                    break;
                } else {
                    numf = numd;
                    numd = tec.nextInt();
                }
            }
            if (num == numf) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("SI");
        }
    }
}