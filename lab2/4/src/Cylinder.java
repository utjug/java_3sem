class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.square(10, 1);
        cyl.volume(10, 1);
        cyl.volume("10", "1");
    }
}

public class Cylinder {
    protected double square(int r, int h) {
        double sqr = 2*Math.PI*r*r+2*Math.PI*r*h;
        System.out.println(sqr);
        return sqr;
    }

    protected double volume(int r, int h) {
        double vol = Math.PI*r*r*h;
        System.out.println(vol);
        return vol;
    }
    protected double square(double r, double h) {
        double sqr = 2*Math.PI*r*r+2*Math.PI*r*h;
        System.out.println(sqr);
        return sqr;
    }

    protected double volume(double r, double h) {
        double vol = Math.PI*r*r*h;
        System.out.println(vol);
        return vol;
    }
    protected double square(String r, String h) {
        double r1 = Double.parseDouble(r);
        double h1 = Double.parseDouble(h);
        double sqr = 2*Math.PI*r1*r1+2*Math.PI*r1*h1;
        System.out.println(sqr);
        return sqr;
    }

    protected double volume(String r, String h) {
        double r1 = Double.parseDouble(r);
        double h1 = Double.parseDouble(h);
        double vol = Math.PI*r1*r1*h1;
        System.out.println(vol);
        return vol;
    }
}
