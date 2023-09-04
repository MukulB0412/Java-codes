package com.mukul;

public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z= (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a , b);
        System.out.println(c);
    }
    // Syntax
    //Method is a function written inside a class since java is an object oriented programming language, we need to write the method inside some class.
    /* datatype name(){
           method body
          }
     */
    //Following method returns the sum of two numbers
    /* int mySum(int a, int b){
       int c = a+b;
       return c;
       }
     */
}