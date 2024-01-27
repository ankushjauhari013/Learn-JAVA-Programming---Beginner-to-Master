package Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Array

        int A[][];
        A =new int[3][];
        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[8];

        System.out.println("Jagged Array: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();

        }



    }
}
