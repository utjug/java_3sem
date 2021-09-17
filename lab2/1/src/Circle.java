public class Circle {
    public static double x;
    public static double y;
    public static double r;

    public void print()  {
        System.out.println("x:"+x+" y:"+y+" r:"+r);
    }
    public void move()   {
    }
    public Double distToOtherCircle()    {
        double r = 1;
        return r;
    }
    public static void changeRadius()   {

    }
    public Double getPerimeter(){
        return (2*Math.PI*r);
    }
    public Double getSquare(){
        return(x*y);
    }

    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
