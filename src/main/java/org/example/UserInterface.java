package org.example;

import java.util.Scanner;

public class UserInterface {

    Omregner omregner = new Omregner();
    int højde = 0;
    int vægt = 0;

    public void welcome(){
        System.out.println("Velkommen til BMI omregner");
        System.out.println("I denne BMI omregner skal vi bruge din højde og din vægt for at regne din vægt ud.");
        System.out.println("Venligst indtast din højde:");
        omregner.højde(højde);
        System.out.println("Venligst indtast din vægt:");
        omregner.vægt(vægt);
        System.out.println("Din BMI er:");
        System.out.println(omregner.bmi());
    }
}
