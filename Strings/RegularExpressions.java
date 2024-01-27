package Strings;

public class RegularExpressions {
    public static void main(String[] args) {

        String str1 = "abc";  // if str1 = abc then false
        System.out.println(str1.matches("."));   //  . is for single character
        System.out.println(str1.matches("[abc]"));  // [abc] single character from abc only
        System.out.println(str1.matches("[^abc]"));  //single character  other than abc
        System.out.println(str1.matches("[a-z0-9]"));  // is single character in range
        System.out.println(str1.matches("[a-z][0-9]")); // need two character
        System.out.println(str1.matches("a|b"));   // single character should be a or b
        System.out.println(str1.matches("abc"));   // Multiple characters are exactly same
        System.out.println(str1.matches("\\w"));   //  'w' works for alphabet and numbers
        System.out.println(str1.matches("\\W"));   //  'W' it is other than digits or alphabets, it is special character
        System.out.println(str1.matches("\\D"));   //  'd' for digit
        System.out.println(str1.matches("\\D"));   //  'D' for not a digit
        System.out.println(str1.matches("\\s"));   //  's' for space
        System.out.println(str1.matches("\\S"));   //  'S' for not a space

    }
}
