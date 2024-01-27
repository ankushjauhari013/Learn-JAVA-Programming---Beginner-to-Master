package Loops;

import java.util.Scanner;

public class SCLoop2 {
    public static void main(String[] args) {

        //Display Digits of number
        Scanner sc = new Scanner(System.in);
        System.out.println("Display Digits from Right to left");
        int num = sc.nextInt();

        int r;
        while(num>0){
            r=num%10;
            num/=10;
            System.out.print(r);
        }

        System.out.println();


        //Count Digits Of a Number

        System.out.println("Enter a number to Count digits ");
        int n = sc.nextInt();
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        System.out.println("Number contains " + count + " digits");




    }
}
