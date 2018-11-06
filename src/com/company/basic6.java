package com.company;

import java.util.Scanner;

public class basic6 {

    public static void main(String[] args) {

        Scanner pago = new Scanner(System.in);
        float total;
        System.out.print("horas trabajadas: ");
        float horas = pago.nextFloat();

        System.out.print("Precio por hora: ");
        float precio_hora = pago.nextFloat();

        if (horas<35){
            total= horas * precio_hora;
            System.out.print("cantidad a pagar: "+ total + "€");
        } else {

        }
    }
}

