package Basic;
import java.util.Scanner;

public class WelcomeMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");

        String name = sc.nextLine();
        System.out.println("Welcome " + name + " ji");
    }
}