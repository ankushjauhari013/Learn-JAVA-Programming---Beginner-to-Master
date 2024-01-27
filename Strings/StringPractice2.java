package Strings;

public class StringPractice2 {
    public static void main(String[] args) {
        String str = new String("WWW.amazon.com");

        System.out.println("String starts with WWW ? "+ str.startsWith("WWW"));
        System.out.println("String ends with .com ? " + str.endsWith(".com"));
        System.out.println("String start with from positioni 4 is : "+ str.startsWith("am",4));
        System.out.println("Character at index 6 is "+str.charAt(6));
        System.out.println("First (dot) . is Present at index " +str.indexOf('.'));  // works from Left to Right
        System.out.println("az is Present at index " +str.indexOf("az"));
        System.out.println("(Dot). in String from 4th index is Present at position : " +str.indexOf('.',4));
        System.out.println("? in String or Not :  "+str.indexOf('?'));
        System.out.println("Last W in the string is at index " +str.lastIndexOf('W'));   //works from Right to Left
    }
}
