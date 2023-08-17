package com.mukul;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your maths marks");
        float maths = sc.nextFloat();
        System.out.println("Enter your English marks");
        float English = sc.nextFloat();
        System.out.println("Enter your Hindi marks");
        float Hindi = sc.nextFloat();
        System.out.println("Enter your SST marks");
        float SST = sc.nextFloat();
        System.out.println("Enter your Science marks");
        float Science = sc.nextFloat();
        System.out.println("Your total cgpa is");
        float sum = maths+English+Hindi+SST+Science;


        System.out.println(sum/50);
    }
}
