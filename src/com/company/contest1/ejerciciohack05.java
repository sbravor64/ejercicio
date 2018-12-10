package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack05 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt();
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int total=1;
        int cont=0;
        boolean f = true;

        if(cant==0) {
            return;
        } else if (cant>0 || cant<=100){
            while (cant!=cont) {
                if (num == 0 && numd == 1) {
                    total = tec.nextInt();
                    if(total==0){
                        System.out.println("SI");
                        cont++;
                    } else if (num + numd == total) {
                        do {
                            num = numd;
                            numd = total;
                            total = tec.nextInt();
                        } while (num + numd == total);

                        if(total==0){
                            System.out.println("SI");
                            cont++;
                        } else if (num + numd != total) {
                            System.out.println("NO");
                            cont++;
                        }
                    } else {
                        System.out.println("NO");
                        cont++;
                    }
                } else {
                    f=false;
                    do {
                        total = tec.nextInt();
                    } while (total!=0);
                    cont++;
                    System.out.println("NO");
                }

                if (cant!=cont) {
                    num = tec.nextInt();
                    numd = tec.nextInt();
                }
            }
        }
    }
}
