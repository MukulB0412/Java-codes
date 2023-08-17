package com.mukul;

public class resultingDatatype {
    /*
    b - byte       f - float    c - character
    s - short      d - double
    i - integer    l - long

    R = b + s ---> int
    R = s + i ---> int
    R = l + f ---> float
    R = i + f ---> float
    R = c + i ---> int
    R = c + s ---> int
    R = l + d ---> double
    R = f + d ---> double
     */

    // Increment and Decrement Operators
    public static void main(String[] args) {
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}
