package OOPs;


class Circle
{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
    public double diameter(){
        return 2*radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.radius=7.3;
        c2.radius=5.3;
        System.out.println("Area of Circle is: "+c1.area());
        System.out.println("Diameter of Circle is: "+c1.diameter());
        System.out.println("Circumference of Circle is: "+ c1.circumference());

        System.out.println("Area of Circle2 is: "+c2.area());
        System.out.println("Diameter of Circle2 is: "+c2.diameter());
        System.out.println("Circumference of Circle2 is: "+ c2.circumference());

    }
}
