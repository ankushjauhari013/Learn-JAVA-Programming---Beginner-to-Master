package Loops;
import java.util.Scanner;

public class SCLoop6APGPFibo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // Program to Print AP Series

        System.out.println("Program to print AP Series ");
        System.out.println("Enter the Values of a,d and n");
        int a = sc.nextInt();
        int d= sc.nextInt();
        int n= sc.nextInt();
        int term =a;
        System.out.printf("AP Series is: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(term+" ");
            term+=d;
        }
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

        //Program to print GP Series

        System.out.println("Program to print GP Series ");
        System.out.println("Enter the Values of a,r and n");
        int a1= sc.nextInt();
        int r1= sc.nextInt();
        int n1= sc.nextInt();
        int term1=a1;
        System.out.printf("GP Series is: ");
        for (int i = 0; i < n1; i++) {
            System.out.printf(term+" ");
            term*=r1;
        }

        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

        //Program to print Fibonacci Series

        System.out.println("Program to print Fibonacci Series ");
        System.out.println("Enter the number of terms ");
        int terms = sc.nextInt();
        int a2=0,b=1,c;
        System.out.print(a2+","+b+",");
        for (int i=0;i<terms-2;i++){
            c=a2+b;
            System.out.print(c+",");
            a2=b;
            b=c;

        }
    }
}
