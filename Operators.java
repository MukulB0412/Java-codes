package com.mukul;

public class Operators {
    /*Operators are used to perform operations on variables and values
    7(operand) +(operator) 9(Operand) = 18(Result)
    >Types of operators :
    1. Arithmetic operators(+ , - , * , / , % , ++.....)
    2. Assignment operators(= , +=....)
    3. Comparison operators(== , >= , <= ...)
    4. Logical operators(&& , || , ! ...)
    5. Bitwise operators(& , | ...)

    Arithmetic operators cannot work with booleans.
     */

    public static void main(String[] args) {
            int a = 4;
            //int b = 6 % a; //Modulo operator
        int b = 9;
        b *= 3;
        System.out.println(b);
        //System.out.println(65<5); //comparison operator

        //System.out.println(64>5 && 64>89);
        System.out.println(64>5 || 64>89);
     }


}
