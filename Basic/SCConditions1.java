package Basic;
import java.util.Scanner;

public class SCConditions1 {
    public static void main(String[] args) {
        int n,age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is a even number.");
        }
        else{
            System.out.println(n + " is a odd number");
        }
        System.out.println("****************************");

        System.out.println("Enter the Age: ");
        age = sc.nextInt();
        if(age>=16 && age<=57){
            System.out.println("You are Young! ");
        }
        else {
            System.out.println("You are not Young! ");
        }

        System.out.println("****************************");

        System.out.println("Enter the marks of 3 subjects: ");

        float m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(m1+m2+m3)/3;
        if(avg>=90){
            System.out.println("You have done Outstanding! ");
        } else if (avg>=75 && avg <90) {
            System.out.println("You are doing good,Work Hard ");
        } else if (avg>=50 && age<75) {
            System.out.println("Be Serious, Caution ");
        }
        else{
            System.out.println("You are fail ");
        }

    }
}
