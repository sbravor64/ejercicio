package com.company.contest7;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String num =tec.nextLine();
        int total=0;

            for (int i = 0; i <num.length() ; i++) {
                char carac = num.charAt(i);
                if(carac!=' '){
                    int carac1= Integer.parseInt(String.valueOf(num.charAt(i)));
                    total += carac1;

                } else if (carac==' ') {
                System.out.println(total);
                total=0;
                } else if (carac==0){
                    return;
                }
            }
    }
}

