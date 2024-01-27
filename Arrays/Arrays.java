package Arrays;

public class Arrays {
    public static void main(String[] args) {


        int a[] = new int[5];
        int B[]={1,2,3,4,5};
        //B[2]=15;

        int [] arr=new int [4];
        int A[] = {1,2,3,4,5};

        /*int C[];
        C=new int[10];*/

        System.out.print("Array is: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Array is: ");
        for (int i = A.length-1; i>=0; i--) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Array using ForEach: ");
        for (int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Length of an array is: "+A.length);
    }
}
