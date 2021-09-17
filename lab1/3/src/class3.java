import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class3 {
    public static void main(String[] args) throws IOException {

        double left = 1.578;
        double right = 7.981;
        String ans ="y";

        while (ans.equals("n") == false) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите число: \n");
            double num = Double.parseDouble(reader.readLine());

            if (num >= left && num <= right) {
                System.out.println("Число принадлежит отрезку\n");
            } else {
                System.out.println("Число не принадлежит отрезку\n");
            }
            System.out.println("Продолжить? (y/n)\n");

            do {
                ans = reader.readLine();
                if (ans.equals("y") == false && ans.equals("n") == false)   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }
    }
}
