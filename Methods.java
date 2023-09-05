package com.mukul;

public class Methods {
    /*
    >> Some of the commonly used strings methods are :
       1. name.length() --> Returns the length of the string name.
       2. name.toLowerCase() --> Returns a new String which has all the lowercase characters from the String name.
       3. name.toUpperCase() --> Returns a new String which has all the lowercase characters from the string name.
       4. name.trim() --> Returns a new String after removing all the leading ane trailing spaces form the original string
       5. name.Substring(int Start) --> Returns a substring from start to the end substring.
       6. name.replace('r' , 'p') --> Returns a new string after replacing r with p.

      //    Escape Sequence Characters
        --->Sequence characters after backslash'\'
     */
    public static void main(String[] args) {
        String name = "mukul";
        // System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String nonTrimmerString = "     Mukul     ";
        System.out.println(nonTrimmerString);

        String trimmedString = nonTrimmerString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace("u" , "k"));
        System.out.println(name.replace("mukul" , "piyush"));

        System.out.println(name.startsWith("m9k"));
        System.out.println(name.endsWith("l"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("l"));

        String modifiedName = "Mukulkul";
        System.out.println(modifiedName.indexOf("kul" , 4));

        System.out.println(modifiedName.lastIndexOf("kul"));

        System.out.println(name.equals("mukul")); //true or false
        System.out.println(name.equalsIgnoreCase("MuKUl")); //true or false
    }
}

