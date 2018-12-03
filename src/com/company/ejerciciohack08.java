package com.company;

import java.util.Scanner;

public class ejerciciohack08 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant = tec.nextInt();
        int num1 = tec.nextInt();
        int num2, num3, numf;
        int cont = 0;
        int contador = 0;

        if (cant == 0) {
            return;
        } else if (cant > 0 || cant <= 100) {
            do {
                if (num1 != 0) {
                    contador++;
                    num2 = tec.nextInt();
                    num3 = tec.nextInt();
                    if (num1 == num2 && num2 == num3) {
                        cont++;
                    }
                    do {
                        num1 = num2;
                        num2 = num3;
                        num3 = tec.nextInt();
                        if (num1 == num2 && num2 == num3) {
                            cont++;
                        }
                    } while (num3 != 0);

                }

                if (cont != 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

                if(cant!=contador){
                    num1=tec.nextInt();
                    cont=0;
                }

            } while (cant!=contador);
        }
    }
}