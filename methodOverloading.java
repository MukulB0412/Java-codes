package com.mukul;
// The values form the method call ( a and b) are copied to the a and b of the function mySum. Thus even if we modify the values a and b inside the method, the values in the main method will not change
// Void return type : When we don't want our method to return anything, we use void as the return type.
// Static keyword is used ti associate a method of a given class with class rather than the object. Static method in a class is shared by all the object.
// method overloading : Two or more can have same name but different parameters. Such method are called overloadinf methods.

public class methodOverloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + "bro!");
    }
    static void foo(char name){
        System.out.println( "Good morning " + name + "bro!");
    }
    static void change(int a) {
        a = 98;
    }
    static void change2(int [] arr) {
        arr[0] = 98;
    }


    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism");
    }

    public static void main(String[] args) {

        // case 1: changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The values of x after running change is  " + x);
        // case 1: changing the integer
//        int[] marks = {53, 45, 66, 64, 88, 58};
//        change2(marks);
//         System.out.println("The values of x after running change is  " + marks[0]);

        //Method Overloading
        foo();
        foo(3000);
        // Arguments are actual!




    }
}
