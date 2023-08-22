package com.mukul;

public class Break_and_continue {
    public static void main(String[] args) {
//        // Break and continue using loops..
//        for (int i=0; i<500 ; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 50) {
//                System.out.println("Ending the loop");
//                break;
//            }
//
//        }
//        System.out.println("Loop ends here");

//        int i = 0 ;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
//        System.out.println("Loop ends here");
//

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }
        System.out.println("Loop ends here");
    }
}
