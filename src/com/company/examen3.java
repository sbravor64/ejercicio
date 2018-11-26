package com.company;

import java.util.Scanner;

public class examen3 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        int num1 = cifras.nextInt();
        int num2 = cifras.nextInt();
        int res = cifras.nextInt();

        if (num1+num2==res){
            System.out.println("+");
        } else if(num1-num2==res){
            System.out.println("-");
        } else if(num1*num2==res){
            System.out.println("*");
        } else if(num1/num2==res){
            System.out.println("/");
        } else if(num1%num2==res){
            System.out.println("%");
        } else {
            System.out.println("IMPOSIBLE");
        }
    }
}

