package Methods;

import org.w3c.dom.ls.LSOutput;

public class Methods {

    int max(int x, int y)   //static methods can call only static methods.
                            // x and y are formal arguments
    {
        if(x>y) return x;
        else return y;
    }
    static void inc(int k)              //it is called by value, means the value of actual parameter
                                        // will not be modified if the formal parameter is changed.
    {
        k++;
        System.out.println("Value in method  "+ k);
    }

    public static void main(String[] args) {

        int a=10,b=15;
        //System.out.println(max(a,b));   //put static in front of max method

        // want to call the max method,another way to call by creating Object
        Methods m = new Methods();
        System.out.println("Max Value is "+ m.max(a,b));   // a and b are actual arguments

        inc(a);
        System.out.println("Value In Main "+a);


    }



}
