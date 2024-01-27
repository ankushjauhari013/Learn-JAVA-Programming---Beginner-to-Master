package Loops;

public class LoopPractice {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Using While Loop");
        while (i<=100){
            System.out.println(i);
            i*=2;
        }
        System.out.println();
        System.out.println("Using do-while Loop");
        int j=1;
        do {
            System.out.println(j);
            j*=2;
        }while (j<=100);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");    // So when you know the number of times then you have to use for..loop.

        System.out.print("Your age is: ");
        for (int age = 0; age < 23; age++) {
            System.out.println(age);

        }
    }
}
