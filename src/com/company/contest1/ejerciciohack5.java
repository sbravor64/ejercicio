package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt();
        int num = tec.nextInt();
        int numd = tec.nextInt();
        int numant;
        int total=0;
        int cont=0;
        boolean f = false;

        if(cant==0) {
            return;
        } else if (cant>=0 || cant<=100){
            while (cant!=cont) {
                if (num == 0 && numd == 1) {
                    f = true;
                    total = tec.nextInt();
                    if (total == 0) {
                        f = true;
                        cont++;
                    } else if (num + numd != total) {
                        f = false;
                        cont++;
                    } while (num+numd==total){
                        if (num+numd!=total){
                            f=false;
                            cont++;
                        } else {
                            f = true;
                            num = numd;
                            numd = total;
                            total = tec.nextInt();
                            if(total==0){
                                cont++;
                                break;
                            }
                            if(num+numd!=total){
                                f=false;
                                cont++;
                            }
                        }
                    }
                } else{
                    while(num!=0 || numd!=1){
                        num=tec.nextInt();
                        if(num==0 || numd==0){
                            break;
                        }
                    }
                    f=false;
                    cont++;
                }

                if (f==true){
                    System.out.println("SI");
                } else if (f==false){
                    System.out.println("NO");
                }

                if(total==0){
                    num=tec.nextInt();
                    numd=tec.nextInt();
                }

                if(numd==0){
                    return;
                }
            }
        }
    }
}