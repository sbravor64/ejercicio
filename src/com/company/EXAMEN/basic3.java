package com.company.EXAMEN;

import java.util.Scanner;

public class basic3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num=tec.nextInt();
        boolean c=false;
        int numd=tec.nextInt();

        while(numd!=0){

            if(num<numd){
                c=true;
            }else{
                c=false;
            }
            int numant=numd;
            num=tec.nextInt();
            if (num==0){
                break;
            }
            numd=tec.nextInt();

            if(numd==0){
                if(numant==num){
                    c=false;
                }
            }
        }

        if(c==true){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }


    }
}

