package com.company.control;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num =tec.nextInt();
        int cont=0,cont1=0,cont2=0,cont3=0;

        if(num==1){
            int numant = num;
            cont1=1;
            num=tec.nextInt();
            int total=num-numant;
            do{
                if(total==1){
                    cont1++;
                } else if(total==2){
                    cont2++;
                } else if(total==3){
                    cont3++;
                }
            numant=num;
            num=tec.nextInt();
            total=num-numant;
            }while(num!=0);
        } else if(num==2){
            int numant = num;
            cont2=1;
            num=tec.nextInt();
            int total=num-numant;
            do{
                if(total==1){
                    cont1++;
                } else if(total==2){
                    cont2++;
                } else if(total==3){
                    cont3++;
                }
                numant=num;
                num=tec.nextInt();
                total=num-numant;
            }while(num!=0);
        } else if(num==3){
            int numant = num;
            cont3=1;
            num=tec.nextInt();
            int total=num-numant;
            do{
                if(total==1){
                    cont1++;
                } else if(total==2){
                    cont2++;
                } else if(total==3){
                    cont3++;
                }
                numant=num;
                num=tec.nextInt();
                total=num-numant;
            }while(num!=0);

        }

        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(cont3);

    }
}

