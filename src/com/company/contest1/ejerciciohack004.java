package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack004 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int total=1;
        boolean f = true;

        if (num == 0 && numd == 1) {
            total = tec.nextInt();
            if(total==0){
                f=true;
            } else if (num + numd == total) {
                do {
                    num = numd;
                    numd = total;
                    total = tec.nextInt();
                } while (num + numd == total);

                if(total==0){
                    f=true;
                } else if (num + numd != total) {
                    f = false;
                }
            } else {
                f = false;
            }
        } else {
            f=false;
        }

        if (f==true){
            System.out.println("SI");
        } else if (f==false){
            System.out.println("NO");
        }
    }
}