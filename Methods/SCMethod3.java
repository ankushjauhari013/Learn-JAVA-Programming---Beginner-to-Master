package Methods;

public class SCMethod3 {

    static int max(int ...A){

        if (A.length==0) return Integer.MIN_VALUE;
        int max=A[0];
        for (int i = 1; i < A.length; i++)
            if (A[i]>max) max=A[i];
        return max;
    }

    static int sum(int ...A)
    {
        int sum=0;
        for (int i = 0; i <A.length; i++)
            sum+=A[i];
        return sum;
    }

    static double disocunt(double ...P)
    {
        double sum=0;

        for(int i=0;i<P.length;i++)
            sum+=P[i];

        System.out.println("Total Sum is: "+sum);
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;

    }


    public static void main(String[] args) {

        System.out.println("Maximum Element is "+max(10,4,8,0,8,40,8,0,12,6,1,2));
        System.out.println("Sum of All Elements is "+sum(10,4,8,0,8,40,8,0,12,6,1,2));
        System.out.println("Discount is "+disocunt(120,30,50,60,80,89,65,45,27,33,64));

    }
}
