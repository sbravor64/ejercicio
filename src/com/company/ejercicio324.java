package com.company;

import java.util.Scanner;

public class ejercicio324 {

    public static void main(String[] args) {

        int [] cambios = {3,2,1,0};

        for (int i = 0; i < cambios.length ; i++) {
            while (cambios [i] != i) {
                int meloguardo = cambios[i];
                cambios[i] = cambios[cambios[i]];
                cambios[meloguardo] = meloguardo;
            }
        }




    }
}

