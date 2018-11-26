package com.company;

import java.util.Scanner;

public class ejerciciohack {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int cont=0;

        while(num>=1){
            cont++;
            num=tec.nextInt();
        }

        System.out.println(cont);
    }
}

