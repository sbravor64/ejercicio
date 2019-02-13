package com.company.contest7;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int Bi=0,Bj=0, Ni=0, Nj=0;
        boolean r=false;
        char [][] matriz = new char[8][8];

        for (int i = 0; i <matriz.length ; i++) {
            String juego = tec.nextLine();
            for (int j = 0; j <matriz[i].length ; j++) {
                char carac = juego.charAt(j);
                matriz [i][j]= carac;

                if(matriz [i][j]=='B'){
                    Bi=i;
                    Bj=j;
                } else if(matriz [i][j]=='N'){
                    Ni=i;
                    Nj=j;
                }
            }
        }

        if(Bi==Ni){
            System.out.println("SI");
        } else if(Bj==Nj){
            System.out.println("SI");
        } else if(Bj+1==Nj){
            System.out.println("SI");
        } else if(Bj>Nj){
            int j=Bi;
            int n=Ni;
            for (int i = Bj; i >=Nj ; i--) {
                if(j<=n){
                    if(matriz [j][i]=='N'){
                        r=true;
                    } else {
                        r=false;
                    }
                    j++;
                } else{
                    if(matriz [j][i]=='N'){
                        r=true;
                    } else {
                        r=false;
                    }
                    j--;
                }
            }
            if(r==true){
                System.out.println("SI");
            } else{
                System.out.println("NO");
            }
        } else if(Bj<Nj){
            int j=Bi;
            int n=Ni;
            for (int i = Bj; i <=Nj ; i++) {
                if(j<=n){
                    if(matriz [j][i]=='N'){
                        r=true;
                    } else {
                        r=false;
                    }
                    j++;
                    if(j==n+1){
                        break;
                    }
                } else{
                    if(matriz [j][i]=='N'){
                        r=true;
                    } else {
                        r=false;
                    }
                    j--;
                }
            }
            if(r==true){
                System.out.println("SI");
            } else{
                System.out.println("NO");
            }
        }
    }
}

