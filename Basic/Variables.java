package Basic;

public class Variables {
    public static void main(String[] args) {

        //int x;
        //int roll_number$student;
        //int _x;

        //int rollNumberOfStudent;
        //float averageMarksOfClass;

        byte b=5;
        short s=2;
        int i=175;
        float f=13.0f;   // Up2 6-7 decimal digits float is good
        double d=23.0;   // if you want more precision then go for double 14-15 digits
        char c = 'A';
        // String str = "Java"; Class reference = object;
        Integer String = 50;
        char code = 0x03C8;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(String);
        System.out.println(code);
        System.out.println("*************************");

        for( char ch=0x0900;ch<=0x0970;ch++){
            System.out.print(ch+ " ");
        }


    }

}
