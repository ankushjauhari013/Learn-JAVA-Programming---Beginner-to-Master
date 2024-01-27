package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Array1_SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;

        //Sum of An Array

        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        System.out.println("Sum of an Array is: "+ sum);

        int sum1=0;
        for (int x:A) {
            sum1+=x;
        }
        System.out.println("Sum of an Array is: "+ sum1);

        //Searching an Element

        System.out.println("Enter the key you want to search in an Array: ");
        int key=sc.nextInt();
        for (int i = 0; i < A.length; i++)
        {
            if(A[i]==key)
            {
            System.out.println("Element found at index "+i);
            System.out.println("System Exit");
            System.exit(0);
            }
        }
        System.out.println("Element not Found");

        //Find max element
        int max=A[0];
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max) max=A[i];
        }
        System.out.println("Maximum element is: "+max);

        int max1=A[0];
        for(int k:A){
            if(k>max1) max1=k;
        }
        System.out.println("Maximum through ForEach: "+max1);

        //2nd largest Element in an Array

        int max11,max22;
        max11=max22=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max11)
            {
                max22=max11;
                max11=A[i];
            }
            else if(A[i]>max22)     max22=A[i];
        }
        System.out.println("Second Largest is "+max22);

    }





}
