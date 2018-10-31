package com.company;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        System.out.print("1 num: ");
        int num1 = cifras.nextInt();
        System.out.print("2 num: ");
        int num2 = cifras.nextInt();

        System.out.println("Pulsa * si deseas multiplicar los numeros ");
        System.out.println("Pulsa + si deseas sumar los numeros ");
        cifras.nextLine();
        String Op=cifras.nextLine();

        if(Op.equals("+")) {
            System.out.println("Total= "+ (num1 + num2));
        } else if(Op.equals("*")) {
            System.out.println("Total= "+ (num1 * num2));
        } else {
            System.out.println("ERROR");
        }

    }
}

