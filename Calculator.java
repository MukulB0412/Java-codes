package com.mukul;
import java.util.Scanner;

public class Calculator {
    /*Taking inputs
      In order to read the data from the keyboard,
      Java has a Scanner class.Scanner class has a lot
      of methods*/
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number 1");
        //int a = sc.nextInt();
        //float a = sc.nextInt();
        //System.out.println("Enter number 2");
        //int b = sc.nextInt();
        //float b = sc.nextInt();
        //int sum = a + b;
        //float  sum = a + b;
        //System.out.println("The sum of these numbers is");
        //System.out.println(sum);
        //boolean b1 = sc.hasNextBigInteger();
        //System.out.println(b1);
        //String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
