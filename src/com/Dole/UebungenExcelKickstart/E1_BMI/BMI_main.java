package com.Dole.UebungenExcelKickstart.E1_BMI;

import java.util.Scanner;

public class BMI_main {
    public static void main(String[] args) {

        double height;
        double weight;
        double bmi;

        Scanner s = new Scanner(System.in);
        System.out.println("Wie viel wiegst du? (in pounds)");
        weight = s.nextDouble();
        System.out.println("Wie groß bist du? (in inches");
        height = s.nextDouble();

        bmi = weight * 703 / (height * height);

        System.out.println("Dein BMI (BodyMassIndex) " + bmi);

        if (bmi <= 18.5) {
            System.out.println("Du bist untergewichtig!");
        } else if (bmi <= 25 && 18.5 < bmi) {
            System.out.println("Du hast ein gesundes Gewicht!");
        } else if (25 < bmi) {
            System.out.println("Du bist übergewichtig!");
        }
    }
}