package Loops;

import java.util.Scanner;

public class SCLoop1 {
    public static void main(String[] args) {

        //Display Multiplication Table

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the table of that Number ");
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+" x "+ i+" = "+ n*i);
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        // Sum of n Natural Numbers

        System.out.println("Enter a number to find the sum ");
        int n1 = sc.nextInt();
        int sum=0;

        for (int i = 1; i < n1; i++) {
            sum+=i;
        }
        System.out.println("Sum of 1 to "+n1 + " is "+ sum);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        // Factorial of a Number

        System.out.println("Enter a number to find the factorial ");
        int f=sc.nextInt();
        long fact=1;

        for (int i = 1; i <=f; i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+ f + " is " + fact);


    }
}
