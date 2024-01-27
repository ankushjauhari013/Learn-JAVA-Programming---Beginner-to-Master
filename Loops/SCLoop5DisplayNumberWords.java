package Loops;

import java.util.Scanner;

public class SCLoop5DisplayNumberWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display number in words

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int r=0;
        String str=""; // in Str bcoz if num is 1700 thn after reversing num will become 71 and will affect 0
        while (n>0){
            r=n%10;
            n/=10;
            str+=r;
        }
        System.out.println(str);

        for (int i = str.length()-1; i >=0; i--) {
            char c=str.charAt(i);

            switch (c){
                case '0':
                    System.out.print("zero ");break;
                case '1':
                    System.out.print("one ");break;
                case '2':
                    System.out.print("two ");break;
                case '3':
                    System.out.print("three ");break;
                case '4':
                    System.out.print("four ");break;
                case '5':
                    System.out.print("five ");break;
                case '6':
                    System.out.print("six ");break;
                case '7':
                    System.out.print("seven ");break;
                case '8':
                    System.out.print("eight ");break;
                case '9':
                    System.out.print("nine ");break;

            }
        }
    }
}
