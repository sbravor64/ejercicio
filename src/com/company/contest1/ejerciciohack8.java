package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack8 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1 = tec.nextInt();
        int num2,num3,numf;
        int cont=0;

        if(num1!=0){
            num2=tec.nextInt();
            num3=tec.nextInt();
            if(num1==num2 && num2==num3){
                cont++;
            }
            do {
                num1=num2;
                num2=num3;
                num3=tec.nextInt();
                if(num1==num2 && num2==num3){
                    cont++;
                }
            } while(num3!=0);

        }

        if (cont!=0){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}