package com.company;

import java.util.Scanner;

public class basic5 {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);
        System.out.print("nota: ");
        float notas = nota.nextInt();

        if (notas>5){
            System.out.println("insuficiente");
        } else if(notas>=5 && notas<=5.9){
            System.out.println("suficiente");
        } else if(notas>=6 && notas<=6.9) {
            System.out.println("OK");
        } else if(notas>=7 && notas<=8.4) {
            System.out.println("Notable");
        } else if(notas>=8.5 && notas<=10) {
            System.out.println("Execelente");
        }
    }
}

