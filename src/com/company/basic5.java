package com.company;

import java.util.Scanner;

public class basic5 {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);
        System.out.print("nota: ");
        double notas = nota.nextDouble();

        if (notas<5){
            System.out.print("insuficiente");
        } else if(notas>=5 && notas<=5.9){
            System.out.print("suficiente");
        } else if(notas>=6 && notas<=6.9) {
            System.out.print("OK");
        } else if(notas>=7 && notas<=8.4) {
            System.out.print("Notable");
        } else if(notas>=8.5 && notas<=10) {
            System.out.print("Execelente");
        }
    }
}

