package com.mukul;

public class ArraysOperations {
    public static void main(String[] args) {
        //int [] marks = {37,43,315,43,23};
        //float [] marks = {37.4f,43.34f,315.34f,43.43f,23};
        //String [] names = {"mukul","piyush","anugrah","agrim","parth","arun"};
        int [] marks = {37,43,315,43,23};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        // Displaying the array (for loop)
        for (int i=0; i< marks.length;i++){
            System.out.println(marks[i]);
        }

        // DIsplaying the array (for-each loop)
        for (int element: marks){
            System.out.println(element);
        }

    }
}

