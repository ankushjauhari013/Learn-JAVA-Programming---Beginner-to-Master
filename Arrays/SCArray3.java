package Arrays;

public class SCArray3 {
    public static void main(String[] args) {

        // Copy array A to B
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];

        System.out.print("Array A is: ");
        for (int k :A)
            System.out.print(k+",");

        System.out.print("\nArray B is: ");

        for (int i = 0; i < A.length; i++)
            B[i]=A[i];

        for (int x:B)
            System.out.print(x +",");


        //Reverse Copying an Array

        int AA[]={8,6,10,9,2,15,7,13,14,11};
        int BB[]=new int[10];
        System.out.print("\nOriginal Array is: ");
        for (int x:AA)
            System.out.print(x+",");
        for (int i = AA.length-1,j=0; i>=0 ; i--,j++)
            BB[j]=AA[i];
        System.out.print("\nReverse Array is: ");
        for (int c:BB)
            System.out.print(c +",");


        //Increase the size of an array
        int AAA[]={8,6,10,9,2};

        System.out.print("\nOld Length of A: "+AAA.length);

        int BBB[]=new int[10];

        for(int i=0;i<AAA.length;i++)
            BBB[i]=AAA[i];

        AAA=BBB;     //Garbage Collector
        BBB=null;
        System.out.println();
        System.out.println("New Length of A: "+AAA.length);



    }
}
