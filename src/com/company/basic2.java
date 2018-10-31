package com.company;

import java.util.Scanner;

public class basic2 {

    public static void main(String[] args) {

        Scanner cifras = new Scanner(System.in);
        System.out.print("1 num: ");
        float num1 = cifras.nextInt();
        System.out.print("2 num: ");
        float num2 = cifras.nextInt();

        float stotal = 0,rtotal = 0,mtotal = 0,dtotal = 0;
        int opcion;

        System.out.println("Pulsa 1 si deseas hacer la operación de los numeros ");
        System.out.println("Pulsa 2 si deseas hacer agregar los numeros a la calculadora ");
        float boton = cifras.nextInt();

        if (boton == 1) {
            System.out.println("1 --> Suma");
            System.out.println("2 --> Resta");
            System.out.println("3 --> Multiplicación");
            System.out.println("4 --> División");
            opcion = cifras.nextInt();
            switch (opcion) {
                case 1:
                    stotal = num1 + num2;
                    System.out.println("suma = " + stotal);
                    break;
                case 2:
                    rtotal = num1 - num2;
                    System.out.println("resta = " + rtotal);
                    break;

                case 3:
                    mtotal = num1 * num2;
                    System.out.println("multiplicación = " + mtotal);
                    break;

                case 4:
                    dtotal = num1 / num2;
                    System.out.println("división = " + dtotal);
                    break;
            }

        }

        if(boton==2) {
            System.out.println("hola");}

    }
}

