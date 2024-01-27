package Methods;
import java.util.Arrays;

public class SCMethod2 {
    static double area(double l,double b)
    {
        return l*b;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
    static double area(double l,double b,double h)
    {
        return ((l*b)+h)/2;
    }

    static int reverse(int n)
    {
        int rev=0;
        while (n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    static int [] reverse(int A[])
    {
        int B[]=new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }

    static void show(int ...x){   // Now this X is a variable argument, it can take any number of values.
        for (int a:x)
            System.out.print(a+",");
    }

   /* static void show(int x,int ...y){
        for (int k:y)
            System.out.print(k+",");
    }*/

    static void showList(int start,String...s)
    {
        for (int i = 0; i < s.length; i++) {
            System.out.println(start+". "+s[i]);
            start++;
        }
    }

    static boolean validate(String name,int age)
    {
        return name.matches("[a-zA-Z\\s]+") && age>=3 && age<=60;
    }

    public static void main(String[] args) {

        System.out.println("Area of Circle is "+area(5.6));
        System.out.println("Area of rectangle is "+area(15.4,12.8));
        System.out.println("Area of Trapezium is "+area(8,4,2));
        System.out.println("Revere of a number is "+reverse(15426));

        int A[]={2,4,6,8,10};
        System.out.print("Reverse of an Array is "+ Arrays.toString(reverse(A)));
        System.out.println();
        System.out.println("Validation is "+validate("Ankush Jauhari",22));
        show(10,20,30,40,50);
        System.out.println();
        show(new int[]{1,3,5,7,9});   //So we say this is an anonymous array which doesn't have any reference.
        System.out.println();
        showList(5,"John","Ankush","Pradip","Smith");

    }
}
