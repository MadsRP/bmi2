package org.example;

import java.util.Scanner;

public class Omregner {

    Scanner scanner = new Scanner(System.in);
    int højde = 0;
    int vægt = 0;
    int bmi = 0;
    public void højde(int højde){
        højde = scanner.nextInt();
    }

    public void vægt(int vægt){
        vægt = scanner.nextInt();
    }

    public int bmi(){
        bmi = vægt / højde^2;
        return bmi;
    }
}
