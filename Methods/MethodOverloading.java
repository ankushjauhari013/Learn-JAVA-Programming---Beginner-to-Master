package Methods;

public class MethodOverloading {

    static int max(byte x,byte y) {   //int x, int y
        return x>y?x:y;
    }
    static float max(float a,float b)
    {
        return a>b?a:b;
    }
    static int max(int p,int q,int r)
    {
     return p>q && p>r?p:(q>r?q:r);   //p>q && p>r && p>s ?p:(q>r && q>s)?q:s;
    }

    public static void main(String[] args) {
        System.out.println("Maximum number is "+max(10,15));    // float is called if byte type is present
        System.out.println("Maximum number is "+max(12.5f,50.6f));
        System.out.println("Maximum number is "+max(4,6));      // float is called if byte type is present

    // these are integer literals and for integer literal the suitable method is float We don't have a byte type of literals, so it is not calling byte.
    //So return type is not considered in comparing two methods.. Only method name and the parameter list is checked.

        System.out.println("Maximum number is "+max(10,15,10));
    }
}
