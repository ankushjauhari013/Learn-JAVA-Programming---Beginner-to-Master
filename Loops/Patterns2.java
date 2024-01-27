package Loops;

public class Patterns2 {
    public static void main(String[] args) {
        System.out.println("Pattern 1--> ");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("Pattern 2--> ");
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                ++count;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
        System.out.println("Pattern 3--> ");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("Pattern 4-->");
        int counter=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                counter++;
                System.out.format("%02d",counter);
            }
            System.out.println("");
        }
    }
}
