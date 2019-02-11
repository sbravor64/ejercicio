package com.company.all;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1=tec.nextInt();
        int num2=tec.nextInt();
        int total=tec.nextInt();

        if(num1+num2==total){
            System.out.println("+");
        } else if(num1-num2==total){
            System.out.println("-");
        } else if(num1*num2==total){
            System.out.println("*");
        }else if(num2==0){
            System.out.println("IMPOSIBLE");
        } else if(num1/num2==total){
            System.out.println("/");
        } else if(num1%num2==total){
            System.out.println("%");
        } else {
            System.out.println("IMPOSIBLE");
        }
    }
}

