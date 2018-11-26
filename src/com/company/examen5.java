package com.company;

import java.util.Scanner;

public class examen5 {
    public static void main(String[] args) {
        // int num2 = 0;
        Scanner cifras = new Scanner(System.in);
        int num = cifras.nextInt();
        int num2 = cifras.nextInt();
        int res = cifras.nextInt();
        int cont = 0;

        if (num + num2 == res) {
            cont++;
        }
        System.out.println(cont);

        //while (num != 0) {
        //    num2 = cifras.nextInt();
        //    if (num + num2 == res) {
        //        cont++;
        //    }
        //}
        //System.out.println(cont);
    }
}

