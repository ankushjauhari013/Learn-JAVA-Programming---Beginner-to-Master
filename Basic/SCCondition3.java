package Basic;
import java.util.Scanner;
public class SCCondition3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Day number");
        int day=sc.nextInt();

        if(day==1){
            System.out.println("Mon");
        } else if(day==2) {
            System.out.println("Tue");
        } else if(day==3) {
            System.out.println("Wed");
        } else if(day==4) {
            System.out.println("Thur");
        } else if(day==5) {
            System.out.println("Fri");
        } else if(day==6) {
            System.out.println("Sat");
        } else if(day==7) {
            System.out.println("Sun");
        } else {
            System.out.println("Invalid Day Number");
        }

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println("Enter a URL: ");
        String url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf("."));
        if(protocol.equals("http")) {
            System.out.println("This is HyperText Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("This is File Transfer Protocol");
        } else if (protocol.equals("https")) {
            System.out.println("This is HyperText Transfer Protocol Secure");
        }
        String ext = url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com")) {
            System.out.println("Website is Commercial");
        } else if (ext.equals("org")) {
            System.out.println("Website of Organisation");
        } else if (ext.equals("net")) {
            System.out.println("Website of a Network");
        }
    }
}
