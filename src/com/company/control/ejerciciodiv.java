package com.company.control;

import java.util.Scanner;

public class ejerciciodiv {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cont=0;
        int dividendo =tec.nextInt();
        int divisor =tec.nextInt();
        int cociente =tec.nextInt();
        int residuo =tec.nextInt();

        int tcociente = dividendo/divisor;
        int tresiduo = dividendo%divisor;

        while(dividendo!=0 || divisor!=0 || cociente!=0 || residuo!=0){
            cont++;
            if(cociente!=tcociente || residuo!=tresiduo){
                System.out.print(cont+")"+" "+tcociente);
            }
            if(residuo!=tresiduo){
                System.out.print(" "+tresiduo);
            }
            dividendo =tec.nextInt();
            divisor =tec.nextInt();
            cociente =tec.nextInt();
            residuo =tec.nextInt();
            tcociente = dividendo/divisor;
            tresiduo = dividendo%divisor;
            System.out.println();
        }

    }
}

