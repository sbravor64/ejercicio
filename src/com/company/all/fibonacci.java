package com.company.all;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant= tec.nextInt();
        int numant=tec.nextInt();
        int num=tec.nextInt();
        int numdes=tec.nextInt();
        boolean f = false;
        int cont=0;

        while(cant!=0 && cant!=cont){
            if(num==0){
                num=tec.nextInt();
                if(num==1){
                    int numdes=tec.nextInt();
                    do {
                        if(numant+num==numdes){
                            f=true;
                        } else {
                            f=false;
                        }
                        numant=num;
                        num=numdes;
                        numdes=tec.nextInt();
                    } while(numdes!=0);
                    if(f=false){
                        System.out.println("NO");
                    } else if(f=true){
                        System.out.println("SI");
                    }
                }
            } else {
                System.out.println("NO");
                while(num!=0){
                    num=tec.nextInt();
                }
            }

            cont++;
        }
    }
}

