package com.company.control;

import java.util.Scanner;

public class ejerciciomeca {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float carac=tec.nextInt();
        float erro=tec.nextInt();
        float seg=tec.nextInt();

        float min=seg/60;

        float preci=(carac-erro)*100/carac;
        float velo=(carac/5)/(seg/60);

        System.out.println((int)preci);
        System.out.println((int)velo);

    }
}

