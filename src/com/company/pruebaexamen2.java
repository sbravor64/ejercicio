package com.company;

import java.util.Scanner;

public class pruebaexamen2 {

    public static void main(String[] args) {
        int comparar = 0;
        int cont = 0;
        int contgrups = 0;
        int cantidad = 1;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num!=0){
            comparar = num;
            num = sc.nextInt();

            if(comparar != num){
                cont++;

                if(cantidad > contgrups){
                    contgrups = cantidad;
                }
                cantidad = 1;
            }
            else if(comparar == num){
                cantidad++;
            }
        }
        System.out.println(cont);
        System.out.println(contgrups);
    }
}

