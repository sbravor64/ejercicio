package com.company;

import java.util.Scanner;

public class pruebaexamen4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1=tec.nextInt();
        int cantidad=tec.nextInt();

        for (int i = 1; i <= cantidad ; i++) {
            num1=num1*6;

        }

    }
}

