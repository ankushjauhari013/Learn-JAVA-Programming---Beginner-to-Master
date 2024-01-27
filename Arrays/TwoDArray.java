package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int A[][] = new int[3][4];
        int B[][] = {{1,2,3,4},{2,4,6,8},{3,5,7,9}};
        int[][] C;
        C=new int[3][4];
        int []D[] =new int[5][5];
        int []E,F[];
        E=new int[5];
        F=new int[5][5];   //F 2D Array
        int[] G,H,I,J;   // All are 1D Array


        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++)
                System.out.print(B[i][j]+",");
            System.out.println();
        }
        System.out.println("*-*-*-*-");
        System.out.println("Using For Each ");
        for (int x[]:B)
        {
            for(int y:x){
                System.out.print(y+",");
            }
            System.out.println();
        }
    }
}
