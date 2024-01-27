package Basic;
import java.util.Scanner;

public class SCConditions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to find RADIX: ");
        String num = sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix=2 ");
        }
        else if(num.matches("[0-7]+")) {
                System.out.println("Octal Radix=8");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal Radix=10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Radix=16");
        }
        else{
            System.out.println("Not a number");
        }

        System.out.println("*************************");
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year +" : Leap Year");
        }
        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }
}
