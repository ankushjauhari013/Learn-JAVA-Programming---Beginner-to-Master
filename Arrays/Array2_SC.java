package Arrays;

public class Array2_SC {
    public static void main(String[] args) {


        //  Left Rotation
        int A[]={3,9,7,8,12,6,15,5,4,10};

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

        int temp=A[0];

        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");



        //Inserting an Element
        int AA[]=new int[10];
        AA[0]=3;AA[1]=9;AA[2]=7;AA[3]=8;AA[4]=12;AA[5]=6;

        int n=6;

        for(int i=0;i<n;i++)
            System.out.print(AA[i]+",");
        System.out.println("");

        int x=20;
        int index=2;

        for(int i=n;i>index;i--)
            AA[i]=AA[i-1];
        AA[index]=x;

        for(int i=0;i<n;i++)
            System.out.print(AA[i]+",");
        System.out.println("");
    }
}
