package com.company;

import java.util.Scanner;

public class basic6 {

    public static void main(String[] args) {

        Scanner pago = new Scanner(System.in);
        double total;
        System.out.print("horas trabajadas: ");
        double horas = pago.nextDouble();
        double extras;

        System.out.print("Precio por hora: ");
        double precio_hora = pago.nextFloat();

        if (horas<35){
            total= (horas * precio_hora);
            System.out.print("cantidad a pagar: "+ total + "€");
        } else if (horas>=35){
            total=(35*precio_hora);
            extras = ((horas-35)*(precio_hora*1.5));
            total = (total+extras);
                System.out.println("cantidad a pagar con horas extras: "+ total + "€");


        }
    }
}

