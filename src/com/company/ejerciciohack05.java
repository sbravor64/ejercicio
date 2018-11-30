package com.company;

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
                        f=true;
                        cont++;
                    } else if (num + numd == total) {
                        do {
                            num = numd;
                            numd = total;
                            total = tec.nextInt();
                        } while (num + numd == total);

                        if(total==0){
                            f=true;
                            cont++;
                        } else if (num + numd != total) {
                            f = false;
                            cont++;
                        }
                    } else {
                        f = false;
                        cont++;
                    }
                }
            }

                if(numd==0){
                    return;
                }
            }
        }
    }
}