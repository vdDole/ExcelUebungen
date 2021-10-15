package com.Dole.UebungenExcelKickstart.E11_MPG;

import java.util.Scanner;

public class MPG_Main {
    public static void main(String[] args) {
        Scanner sIN = new Scanner(System.in);

        int miles;
        int gallons;
        int mpg;

        System.out.println("How many miles have you driven?");
        miles = sIN.nextInt();
        System.out.println("How much gas (in gallons) have you used?");
        gallons = sIN.nextInt();

        mpg = miles / gallons;

        System.out.println("You have driven " + mpg + " miles per gallon");
    }
}
