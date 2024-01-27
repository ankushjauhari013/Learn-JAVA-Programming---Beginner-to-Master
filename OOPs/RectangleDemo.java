package OOPs;

class Rectangle
{
    public int length;
    public int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (length+breadth)*2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(length,2)+Math.pow(breadth,2));
    }

    public boolean isSquare(){
        return length == breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.length=5;
        r1.breadth=6;
        System.out.println("Area of Rectangle is: "+r1.area());
        System.out.println("Diagonal of Rectangle is: "+r1.diagonal());
        System.out.println("Perimeter of Rectangle is: "+ r1.perimeter());
        System.out.println("Is it Square? "+r1.isSquare());

    }
}
