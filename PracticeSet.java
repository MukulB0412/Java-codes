package com.mukul;

public class PracticeSet {
    public static void main(String[] args) {
//        // Practice Problem 1
//
//        float [] marks = {45.4f, 34.8f, 85.5f, 39.9f, 100.0f};
//        float sum  = 0;
//        for (float element:marks){
//            sum = sum + element;
//        }
//
//        System.out.println("The value of sum is " + sum);


//        // Practice Problem 2
//
//        float [] marks = {45.4f, 34.8f, 85.5f, 39.9f, 100.0f};
//        float num  = 45.0f;
//        boolean isInArray = false;
//        for (float element:marks){
//            if (num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else {
//            System.out.println("The value is not present in the array");
//        }


//        // Practice Problem 3
//        float [] marks = {45.4f, 34.8f, 85.5f, 39.9f, 100.0f};
//        float sum  = 0;
//        for (float element:marks){
//            sum = sum + element;
//        }
//
//        System.out.println("The value of average marks is" +  sum/marks.length);


//          // Practice Problem 4
//          int [][] mat1 = {{1,2,3},
//                            {4,5,6}};
//          int [][] mat2 = {{2,6,13},
//                            {3,7,1}};
//          int [][] result = {{0,0,0},
//                            {0,0,0}};
//          for (int i =0;i<mat1.length;i++ ){
//              for (int j =0;j<mat1[i].length;j++){
//                  System.out.printf("Setting value for i=%d and j=%d\n", i, j);
//                  result[i][j]= mat1[i][j] + mat2[i][j];
//              }

//        // Problem 5
//        int [] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i= 0 ; i<n ; i++){
//            //Swap a[i] and a[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//
//          }
//        for(int element: arr){
//            System.out.println(element);
//        }

//        //Problem 6 maximum of an element
//        int [] arr = {12, 343, 443, 323, -935, 845, 347, 384, 242};
//        int max = 0;
//        for (int element: arr){
//            if (element > max){
//                max = element;
//            }
//        }
//        System.out.println("The value of the maximum element in this array is : " + max);
//

        // Problem 8 (sorted or not)
        int [] arr = {3, 345, 543, 3, 534, 5, 344};
        boolean isSorted = true;
        for(int i=0; i<arr.length - 1;i++){
            if (arr[i] < arr [i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }




    }
}
