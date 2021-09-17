public class Main {
    public static void main(String[] args) {
        double vol = getVol();
        double sqr = getSqr();

        System.out.println(vol);
        System.out.println(sqr);
    }

    public static double getVol() {
        Ppd fig = new Ppd(1, 2, 3);
        double a = fig.getA();
        double b = fig.getB();
        double c = fig.getC();

        double vol = a*b*c;
        return vol;
    }

    public static double getSqr() {
        Ppd fig = new Ppd(1, 2, 3);
        double a = fig.getA();
        double b = fig.getB();
        double c = fig.getC();

        double sqr = 2*(a*b+b*c+a*c);
        return sqr;
    }
}
