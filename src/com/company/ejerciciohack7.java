package com.company;

import java.util.Scanner;

public class ejerciciohack7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt();
        int num = tec.nextInt();
        int numd= tec.nextInt();
        int numf=0;
        int cont=0;

        if(cant==0) {
            return;
        } else if (cant>0 || cant<=100) {
           do {
               if (numd!=0) {
                   while (num != 0) {
                       if (numd == 0) {
                           cont++;
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
                   cont++;
                   System.out.println("SI");
               }

               if(cant!=cont){
                   num=tec.nextInt();
                   numd=tec.nextInt();
               } else{
                   break;
               }

            } while (cant!=cont);
        }
    }
}