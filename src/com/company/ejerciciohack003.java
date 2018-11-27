package com.company;

import java.util.Scanner;

public class ejerciciohack003 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total=0;
        int numdd=0;
        boolean f = true;


        if (num==0 && numd==1){
            f=true;
            total=tec.nextInt();
            if(total==0){
                f=true;
            }else if (num+numd!=total){
                f=false;
            } while (num+numd==total || total==0){
                if(total==0){
                    f=true;
                    break;
                } else if (num+numd!=total){
                    f=false;
                } else {
                    f = true;
                    num = numd;
                    numd = total;
                    total = tec.nextInt();
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