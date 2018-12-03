package com.company;

import java.util.Scanner;

public class ejerciciohack9 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int cont=0;


        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }

            if(num!=0){
                num=tec.nextInt();
            } else {
                break;
            }
        }

        if(cont!=0){
            System.out.println(cont);
        } else {
            System.out.println(cont);
        }
    }
}