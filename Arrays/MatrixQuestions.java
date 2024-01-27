package Arrays;
// import java.util.Arrays;

public class MatrixQuestions {
    public static void main(String[] args) {


        //Adding 2 Matrix

        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};

        int C[][]=new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];

            }
        }

        System.out.println("Addition of A and B is: ");
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println("");
        }
        System.out.println("*-*-*-*-*-*-*-*-*-");

        // Multiply 2 Matrices

        System.out.println("Multiplicaton of 2 Matrix: ");
        System.out.println("*-*-*-*-*-*-*-*-*-");

        int A1[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B1[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C1[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C1[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C1[i][j]=C1[i][j]+A1[i][k]*B1[k][j];
                }
            }
    }
        for(int x1[]:C1)
        {
            for(int y:x1)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        System.out.println("We are Doing Sorting: ");
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};

        // Sort subarray from index 1 to 4
        // keep other elements as it is.
        // Arrays.sort(arr, 1, 5);

        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.print(x+",");
}
}
