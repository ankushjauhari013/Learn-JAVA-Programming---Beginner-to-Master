package Strings;

public class StringPractice3 {
    public static void main(String[] args) {


       /* String str1 = "JAVA";
        String str2 = "java";
        String str3 = "python";
        String str4 = "python";

       // str2.compareTo(str3) -----> dictionary Order
       // str3.compareTo(str2) -----> 1st string is greater then +1, else -1
        So this compareTo() function returns either -1 , 0 or 1. So -1, if the first string is smaller.
        0,If both the strings are equal.And 1, if the first string is larger.
        //uppercase "JAVA is smaller than lowercase "java". (ASCII logic)


        String str5 = "cplus";
        String str6 = "cplus";
        String str7 = new String("cplus");

        //equals() -----> (Check Content)
        //equalsIgnoreCase()-----> (Check content and will ignore Case)
        //== -----> (Check References)

        System.out.println(str5.equals(str6));
        System.out.println(str7.equals(str5));
        System.out.println(str5==str6);
        System.out.println(str7==str1);*/


        String str1="Pyramid";
        String str2="pyramid";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);


        String str11="china wall";
        String str22=new String("china tall");

        //System.out.println(str11.equals(str22));
        System.out.println(str11.compareTo(str22));

        String str111="the great wall ";
        String str222="of china";
        System.out.println(str111.contains("wall"));
        System.out.println(str111.concat(str222));//System.out.println(str111 + str222);


        float f  = 10.05f;
        double d = 10.02;
        String s1 = String.valueOf(f);
        String s2 = String.valueOf(d);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(f + " is of type " + ((Object)f).getClass().getSimpleName());
        System.out.println(s1 + " is of type " + ((Object)s1).getClass().getSimpleName());




    }
}
