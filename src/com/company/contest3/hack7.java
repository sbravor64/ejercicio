package com.company.contest3;

import java.util.Arrays;
import java.util.Scanner;

public class hack7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), i,mayor, cont=0;
        boolean secuencia=true;
        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();
        } i=0;

        Arrays.sort(num);

        for (int j = 0; j < cant; j++) {
            if(num[0]==1 && cant==1){
                secuencia=true;
            }
            i++;
            if(i==cant){
                break;
            }
            if(num[j]<num[i]){
                secuencia=true;
            } else {
                secuencia=false;
                break;
            }
        }

        if(secuencia==true){
            System.out.println("SI");
        } else{
            System.out.println("NO");
        }
    }
}