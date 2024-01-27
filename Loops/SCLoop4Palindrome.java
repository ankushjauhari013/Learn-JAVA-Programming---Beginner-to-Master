package Loops;

import java.util.Scanner;

public class SCLoop4Palindrome {
    public static void main(String[] args) {

        // Check Number is Palindrome or not also reverse a number

//        System.out.println("Enter a Number to check number is Palindrome or not");
        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int temp = num;
//        int r =0,sum=0;
//        while (num > 0) {
//            r = num % 10;
//            sum =  (sum*10)+r;
//            num /= 10;
//        }
//        if (sum == temp) System.out.println(temp+ " is a Palindrome number ");
//        else System.out.println(temp+" is Not a Palindrome number");
//
//        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        // String is Palindrome or not

        System.out.println("Enter a String to check string is Palindrome or not");

        String original = sc.nextLine();
        String reverse="";
        int length = original.length();

        for (int i=length-1;i>=0;i--) {
            reverse = reverse+original.charAt(i);
        }
        if (original.equals(reverse)) System.out.println(original + " is Palindrome");
        else System.out.println(original + " is not a Panlindrome");




    }
}
