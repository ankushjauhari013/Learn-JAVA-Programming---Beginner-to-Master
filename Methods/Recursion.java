package Methods;

public class Recursion {

    static void fun(int n){
        if(n>0)
        {
            fun(n-1);
            System.out.print(n+",");
        }
    }
    static void fun1(int k) {
        if (k > 0) {
            System.out.print(k+",");
            fun1(k - 1);
        }
    }
    public static void main(String[] args) {
        fun(3);
        System.out.println();
        fun1(3);
    }
}
