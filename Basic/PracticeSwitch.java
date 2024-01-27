package Basic;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a number to find the day: ");
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        switch (str){
            case "1":
                System.out.println("Monday");break;
            case "2":
                System.out.println("Tuesday");break;
            case "3":
                System.out.println("Wednesday");break;
            case "4":
                System.out.println("Thursday");break;
            case "5":
                System.out.println("Friday");break;
            case "6":
                System.out.println("Saturday");break;
            case "7":
                System.out.println("Sunday");break;
            default:
                System.out.println("Not a valid day! ");break;
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("Enter a number to find Month: ex(01,02,03...) ");
        String num;
        num = sc.nextLine();

        switch (num){
            case "01":
                System.out.println("January");break;
            case "02":
                System.out.println("February");break;
            case "03":
                System.out.println("March");break;
            case "04":
                System.out.println("April");break;
            case "05":
                System.out.println("May");break;
            case "06":
                System.out.println("June");break;
            case "07":
                System.out.println("July");break;
            case "08":
            System.out.println("August");break;
            case "09":
                System.out.println("September");break;
            case "10":
                System.out.println("October");break;
            case "11":
                System.out.println("November");break;
            case "12":
                System.out.println("December");break;
            default:
                System.out.println("Invalid Month ");
        }
    }
}
