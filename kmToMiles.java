package com.mukul;
import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers to convert it into miles:");
        float km = sc.nextFloat();
        System.out.println( km*0.621371 + "Miles");


    }
}
