package com.company.contest7;

import jdk.nashorn.api.tree.ForInLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char [][] matriz = new char[3][3];   // {}
        int cont=0;
        
        for (int i = 0; i <matriz.length ; i++) {
            String juego = tec.nextLine();
            for (int j = 0; j <matriz[i].length ; j++) {
                char carac = juego.charAt(j);
                matriz [i][j]= carac;
            }
        }

        if(matriz[0][0]==matriz[0][1] && matriz[0][1]==matriz[0][2]){
            if(matriz[0][0]=='O'){
                System.out.println('O');
            } else if(matriz[0][0]=='X'){
                System.out.println('X');
            }
        } else if(matriz[1][0]==matriz[1][1] && matriz[1][1]==matriz[1][2]){
            if(matriz[1][0]=='O'){
                System.out.println('O');
            } else if(matriz[1][0]=='X'){
                System.out.println('X');
            }
        } else if(matriz[2][0]==matriz[2][1] && matriz[2][1]==matriz[2][2]){
            if(matriz[2][0]=='O'){
                System.out.println('O');
            } else if(matriz[2][0]=='X'){
                System.out.println('X');
            }
        } else if(matriz[0][0]==matriz[1][0] && matriz[1][0]==matriz[2][0]){
            if(matriz[0][0]=='-'){
                System.out.println('O');
            } else if(matriz[0][0]=='X'){
                System.out.println('X');
            }
        } else if(matriz[0][1]==matriz[1][1] && matriz[1][1]==matriz[2][1]){
            if(matriz[0][1]=='O'){
                System.out.println('O');
            } else if(matriz[0][1]=='X'){
                System.out.println('X');
            }
        } else if(matriz[0][2]==matriz[1][2] && matriz[1][2]==matriz[2][2]){
            if(matriz[0][2]=='O'){
                System.out.println('O');
            } else if(matriz[0][2]=='X'){
                System.out.println('X');
            }
        } else if(matriz[0][0]==matriz[1][1] && matriz[1][1]==matriz[2][2]){
            if(matriz[0][0]=='O'){
                System.out.println('O');
            } else if(matriz[0][0]=='X'){
                System.out.println('X');
            }
        } else if(matriz[0][2]==matriz[1][1] && matriz[1][1]==matriz[2][0]){
            if(matriz[0][2]=='O'){
                System.out.println('O');
            } else if(matriz[0][2]=='X'){
                System.out.println('X');
            }
        } else {
            System.out.println('-');
        }
    }
}

