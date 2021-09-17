class  Main {
    public static void main(String[] args) {
        MathUtils.pow(2, 3);
        MathUtils.fctrl(5);
    }
}

public class MathUtils {
    public static double pow(int x, int y) {
        System.out.println(Math.pow(x,y));
        return Math.pow(x,y);
    }
    public static double fctrl (double x) {
        double res = 1;
        for (int i = 2; i <= x; i++){
            res *= i;
        }
        System.out.println(res);
        return res;
    }
}


