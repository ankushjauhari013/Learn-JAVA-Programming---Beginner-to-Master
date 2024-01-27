package Methods;

public class SC_GCD_Prime {
    int GCD(int m,int n)
    {
        System.out.print("GCD of "+m +" and "+n +" is " );

        while (m!=n)
        {
         if(m>n) m=m-n;
         else n=n-m;
        }
        return m;
    }
    static String isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                System.out.print(n);
                return " is not a prime number";
            }
        }
        System.out.print(n);
        return " is a prime number";
    }

    public static void main(String[] args) {
        System.out.println(isPrime(19));
        SC_GCD_Prime gcd = new SC_GCD_Prime();
        System.out.println(gcd.GCD(25,15));
    }
}
