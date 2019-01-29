package com.company.contest7;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String direc =tec.nextLine();
        int x=0, y=0;

            for (int i = 0; i <direc.length() ; i++) {
                char carac = direc.charAt(i);
                if(carac=='N'){
                    x++;
                } else if(carac=='S'){
                    x--;
                } else if(carac=='E'){
                    y++;
                } else{
                    y--;
                }
            }
        System.out.println(y);
        System.out.println(x);
    }
}

