class Params {
    Double a;
    Double b;
    Double r;

    Params(Double x, Double y, Double z) {
        a = x;
        b = y;
        r = z;
    }
}

interface Figure {
    void getFigureName();
    Double getPerimeter(Params p);
    Double getSquare(Params p);
    void show(Params p);
}

class Circle implements Figure {
    @Override
    public void getFigureName() {
        System.out.println("Circle");
    }
    @Override
    public Double getPerimeter(Params p) {
        return 2*Math.PI*p.r;
    }
    @Override
    public Double getSquare(Params p) {
        return Math.PI*p.r*p.r;
    }
    public void show(Params p) {
        System.out.println("Perimeter: " + getPerimeter(p) + "\nSquare: " + getSquare(p));
    }
}

abstract class Quadrangle implements Figure {
    @Override
    public void getFigureName() {
        System.out.println("Quadrangle");
    }
    @Override
    public abstract Double getPerimeter(Params p);
    @Override
    public abstract Double getSquare(Params p);
    @Override
    public void show(Params p) {
        System.out.println("Perimeter: " + getPerimeter(p) + "\nSquare: " + getSquare(p));
    }
}

class Square extends Quadrangle {
    @Override
    public void getFigureName() {
        System.out.println("Square");
    }
    @Override
    public Double getPerimeter(Params p) {
        return 4*p.a;
    }
    @Override
    public Double getSquare(Params p) {
        return p.a*p.a;
    }
}

class Rectangle extends Quadrangle {
    @Override
    public void getFigureName() {
        System.out.println("Rectangle");
    }
    @Override
    public Double getPerimeter(Params p) {
        return 2*(p.a + p.b);
    }
    @Override
    public Double getSquare(Params p) {
        return p.a*p.b;
    }
}

public class CW32 {
    public static void main(String[] args) {
        Params p = new Params(3.0, 5.0, 4.0);
        Figure figure = new Rectangle();
        figure.show(p);
    }
}
