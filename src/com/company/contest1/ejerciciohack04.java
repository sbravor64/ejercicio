package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack04 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total=0;
        boolean f = true;


        if (num==0 && numd==1){
            f=true;
            total=tec.nextInt();
            if(total==0){
                f=true;
            }else if (num+numd!=total){
                f=false;
            } while (num+numd==total){
                if (num+numd!=total){
                    f=false;
                } else {
                    f = true;
                    num = numd;
                    numd = total;
                    total = tec.nextInt();
                    if(total==0){
                        break;
                    }
                    if(num+numd!=total){
                        f=false;
                    }
                }

            }
        }

        if (f==true){
            System.out.println("SI");
        } else if (f==false){
            System.out.println("NO");
        }

    }
}