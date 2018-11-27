package com.company;

import java.util.Scanner;

public class ejerciciohack03 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total=tec.nextInt();
        int numdd=0;

        if (num==0 && numd==1 && total==0){
            System.out.println("SI");
        } else if (num+numd==total){
            numdd=tec.nextInt();
            if (numdd==0){
                System.out.println("SI");
            }
        } else if (total==1){
              if(numd+num==total){
                  numant=numd;
                  numd=total;
                  total=numdd;
                  while (numant+numd==total){
                      numant=numd;
                      numd=total;
                      total=tec.nextInt();
                  }
                  System.out.println("SI");
              }
        } else {
            System.out.println("NO");
        }

    }
}