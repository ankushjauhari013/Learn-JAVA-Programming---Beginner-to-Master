package Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int A[][] = new int[5][5];
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};

        System.out.println("Array is: ");
        for (int i = 0; i <B.length ; i++) {
            for (int j = 0; j <B[i].length ; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Length of B is: "+B.length);




    }
}
