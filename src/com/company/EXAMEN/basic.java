package com.company.EXAMEN;

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n1=tec.nextInt();
        int n2=tec.nextInt();
        int n3=tec.nextInt();
        int n4=tec.nextInt();
        int n5=tec.nextInt();

        int e1=tec.nextInt();
        int e2=tec.nextInt();
        int e3=tec.nextInt();

        int e=tec.nextInt();
        int f=tec.nextInt();

        boolean n=false;

        if(n3>=5 && n4>=5 && n5>=5){
            n=true;
            if(e1>=5 && e2>=5 && e3>=5 ){
                n=true;
            } else{
                n=false;
            }
            int por=(85-f)*100/85;
            if(por>=50){
                n=true;
            }
        } else {
            n=false;
        }


    }
}

