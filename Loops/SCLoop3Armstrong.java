package Loops;
import java.util.Scanner;

public class SCLoop3Armstrong {
    public static void main(String[] args) {

        // Check Number is Armstrong number or Not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Check number is Armstrong number or Not ");

        long n = sc.nextInt();
        long temp = n;
        long temp1 = n;

        double count = 0;
        while (temp1 > 0) {
            temp1 = temp1 / 10;
            count++;
        }

        long sum = 0;
        double r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = (long) (sum + Math.pow(r, count));
        }
        if (temp == sum) System.out.println("Number is Armstrong ");
        else System.out.println("Number is not  Armstrong");

    }
}
