package com.company.EXAMEN;

import java.util.Scanner;

public class basic2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int vcontm=0,vconte=0,vcontmy=0;
        int scontm=0,sconte=0,scontmy=0;
        int dcontm=0,dconte=0,dcontmy=0;
        int cant = tec.nextInt();


        for (int i = 0; i <cant ; i++) {
            tec.nextLine();
            String dia = tec.nextLine();
            char cd=dia.charAt(0);
            int edad=tec.nextInt();
            while(edad!=-1 && cd=='v'){
                if(edad<18){
                    vcontm++;
                } else if(edad>=18 && edad<=65){
                    vconte++;
                } else if(edad>65){
                    vcontmy++;
                }

                edad=tec.nextInt();
            }
            while(edad!=-1 && cd=='s'){
                if(edad<18){
                    scontm++;
                } else if(edad>=18 && edad<=65){
                    sconte++;
                } else if(edad>65){
                    scontmy++;
                }

                edad=tec.nextInt();
            }
            while(edad!=-1 && cd=='d'){
                if(edad<18){
                    dcontm++;
                } else if(edad>=18 && edad<=65){
                    dconte++;
                } else if(edad>65){
                    dcontmy++;
                }

                edad=tec.nextInt();
            }
        }

        System.out.println("viernes");
        System.out.println("0-17"+" "+":"+" "+vcontm);
        System.out.println("18-64"+" "+":"+" "+vconte);
        System.out.println("+65"+" "+":"+" "+vcontmy);
        System.out.println();
        System.out.println("sabado");
        System.out.println("0-17"+" "+":"+" "+scontm);
        System.out.println("18-64"+" "+":"+" "+sconte);
        System.out.println("+65"+" "+":"+" "+scontmy);
        System.out.println();
        System.out.println("domingo");
        System.out.println("0-17"+" "+":"+" "+dcontm);
        System.out.println("18-64"+" "+":"+" "+dconte);
        System.out.println("+65"+" "+":"+" "+dcontmy);
    }
}

