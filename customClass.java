package com.mukul;


class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is" + name);
    }

    public static class custom_Class {


        public static void main(String[] args) {

            System.out.println("This is our custom class");
            Employee mukul = new Employee();// Instantiating a new employee object
            //Setting properties
            mukul.id = 12;
            mukul.name = "Mukul";
            mukul.printDetails();
            //Printing the attributes
            //System.out.println(mukul.id);
            //System.out.println(mukul.name);
        }
    }
}