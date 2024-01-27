package Basic;

public class Literals {
    public static void main(String[] args) {
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;

        System.out.println("In Decimal: "+b1);
        System.out.println("In Binary: " +b2);
        System.out.println("In Octal: "+b3);
        System.out.println("In HexaDecimal "+b4);

        long l=9999999999L;
        float f=12.56f;
        double d=12.56d;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        //int i=125L;
        //long l= 999_999_999_999;
        //Any number in decimal is byDefault Double

    }

}
