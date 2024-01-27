package Strings;

public class StringPractice {
    public static void main(String[] args) {
        /*
        String str1="Java Program";
        System.out.println(str1);

        "Java Program" is called as a literal or a string literal that will be there inside the string pool.
        And this str1 is a reference to this one.


        String str2=new String("JAVA");
        System.out.println(str2);

        There is another method of creating a string that is string str2 and call constructor new string.
        But here this a string will be created in a heap.
        When we say new, so it will be created in a heap.


        char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);
        System.out.println(str3);

        byte b[]={65,66,67,68};
        //String str4=new String(b);
        String str4=new String(b,2,2);
        String str4=new String(b,1,2);
        System.out.println(str4);
        */

        String str1="Java";
        //String str2="Java";
        String str3="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2==str3);



    }
}
