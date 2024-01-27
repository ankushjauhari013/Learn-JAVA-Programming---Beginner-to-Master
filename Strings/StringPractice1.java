package Strings;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        String str = new String("NETBEANS");
        String msg = new String("    Welcome    ");
        System.out.println("Length of String is: "+ str.length());
        System.out.println("String in Lower Case: " + str.toLowerCase()); //it will not change the original string. (Immutable)
        System.out.println("String in Upper Case: " + str.toUpperCase());
        System.out.println("Message After Trimming: " +str.trim());
        System.out.println("Substring from Begining: " + str.substring(2));
        System.out.println("Substring from Begin to End: "+ str.substring(2,6)); //6 excluded (Endindex -1)
        System.out.println("After replacing: "+ str.replace('E','A'));











    }
}
