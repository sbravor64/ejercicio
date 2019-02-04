package com.company.contest7;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String direc =tec.nextLine();
        int x=0, y=0;

            for (int i = 0; i <direc.length() ; i++) {
                if(direc.charAt(i)=='N'){
                    x++;
                } else if(direc.charAt(i)=='S'){
                    x--;
                } else if(direc.charAt(i)=='E'){
                    y++;
                } else{
                    y--;
                }
            }
        System.out.println(y);
        System.out.println(x);
    }
}

