package com.company;

import java.util.Scanner;

public class pruebaexamen3 {

    public static void main(String[] args) {

        int mayor;
        int menor;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num!=0){
            mayor=num;
            num=sc.nextInt();
            if (mayor > num){
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}

