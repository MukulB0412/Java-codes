package com.mukul;
class MyEmployee{
    private int id ;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = 'i';
    }


}
public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee mukul = new MyEmployee();
        //mukul.id = 45;
        //mukul.name = "mukul Bhardwaj";   ----> Throus an error due to private access modifier
        mukul.setName("MukulBhardwaj");
        System.out.println(mukul.getName());


    }
}
