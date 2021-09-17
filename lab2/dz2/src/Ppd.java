public class Ppd {
    private double a;
    private double b;
    private double c;

    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }

    void setA(double x) {
        a = x;
    }
    void setB(double x) {
        b = x;
    }
    void setC(double x) {
        c = x;
    }

    Ppd(double x, double y, double z) {
        setA(x);
        setB(y);
        setC(z);
    }
}
