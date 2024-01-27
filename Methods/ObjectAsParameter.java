package Methods;

import Basic.WelcomeMessage;

public class ObjectAsParameter {

    /*So we know very well that Array will be inside heap and this reference will be created inside the stack
    because this is inside a method.
    So as it is inside the method, it will be created inside stack.
    That object is in heap.

    Reference is also a variable, right?
    Which can hold the objects.

    The content inside actual parameter will be copied in formal parameter.

    But here the value is copied from here.
    That is nothing but address.
    So address is copied.
    Yes, but object is common.
    So object remains single copy only.
    But there are two references holding that same object.

    So the conclusion is in both the cases, the contents of actual parameters copied in formal contents
    of actual copied in formal.
    But here that was value data.
    Data is copied so that same data is used here it was reference.
    So reference is copied.
    So let us say address, write, address of this object.
    So it is copied, but it is not having its own object.
    */

    static void change(int A[],int index,int value)
    {A[index]=value;}

    static void change2(int x,int value)
    {
        x=value;
        System.out.println("Value in change method "+x);
    }


    static int add(int x, int y){
        int z;
        z=x+y;
        return z;
    }
    static void Message(String n){
        System.out.println("Welcome Mr "+n);
    }


    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        System.out.println("Original Array is: ");
        for (int k:A)
            System.out.print(k+",");
        System.out.println();
        change(A,2,20);
        System.out.println("Updated Array is: ");
        for (int x:A)
            System.out.print(x+",");

        System.out.println();

        int x=10;
        change2(x,20);
        System.out.println("Value of Primitive : "+x);

        String name = "Ankush Jauhari";
        Message(name);

        int a=10,b=5;
        int c=add(a,b);
        System.out.println("Addition is: "+c);



    }




}
