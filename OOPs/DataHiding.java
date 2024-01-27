package OOPs;
class Rect
{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>0) length=l;
        else l=0;
    }
    public void setBreadth(double b){
        if (b>0) breadth=b;
        else b=0;
    }

    public double area(){
        return getLength()*getBreadth();
        // length*breadth;
    }
    public double permimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(length,2)+Math.pow(breadth,2));
    }

}
public class DataHiding {

    public static void main(String[] args) {

        Rect r=new Rect();
        r.setLength(10.5);
        r.setBreadth(2.4);

        System.out.println("Length is: "+r.getLength());
        System.out.println("Breadth is: "+r.getBreadth());
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.permimeter());
        System.out.println("Diagonal is: "+r.diagonal());
        System.out.println("Is it Square: "+r.isSquare());


    }

}
