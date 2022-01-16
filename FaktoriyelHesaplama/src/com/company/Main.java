package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sayac = n;
        long factoriyel = 1;
        while (sayac > 1){
            factoriyel *= sayac;
            sayac--;
        }
        System.out.println(factoriyel + " Faktöriyel Sonucudur\n");
    }
}
