import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Roots mainRoot = new Roots();
        mainRoot = getRoots();
        System.out.println("Корней: "+mainRoot.count);
        if (mainRoot.count == 2) {
            System.out.println("x1 = "+mainRoot.x1);
            System.out.println("x2 = "+mainRoot.x2);
        }
        if (mainRoot.count == 1) {
            System.out.println("x = "+mainRoot.x1);
        }
    }

    private static Roots getRoots() throws IOException {
        double X1 = 0;
        double X2 = 0;
        int count = 0;
        System.out.println("Введите коэффициенты:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

        double D = b*b - 4*a*c;
        if (D>0)    {
            count = 2;
            X1 = (-b - Math.sqrt(D))/(2*a);
            X2 = (-b + Math.sqrt(D))/(2*a);
        }
        else {
            if (D == 0) {
                count = 1;
                X1 = (-b)/(2*a);
            }
        }
        Roots roots = new Roots();
        roots.x1 = X1;
        roots.x2 = X2;
        roots.count = count;
        return roots;
    }
}
