class Rect
{
    private double length1;
    private double breadth1;

    public double getLength(){
        return length1;
    }
    public double getBreadth(){
        return breadth1;
    }
    public void setLength(double l){
        if(l>0) length1=l;
        else l=0;
    }
    public void setBreadth(double b){
        if (b>0) breadth1=b;
        else b=0;
    }

    public double area(){
        return getLength()*getBreadth();
        // length*breadth;
    }
    public double permimeter(){
        return 2*(length1+breadth1);
    }
    public boolean isSquare(){
        return length1==breadth1;
    }

}
public class DataHiding {

    public static void main(String[] args) {

        Rect r=new Rect();
        r.setLength(10.5);
        r.setBreadth(2.4);

        System.out.println("Area is "+r.area());

    }

}
