import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class1 {
    public static void main(String[] args) throws IOException {
        String ans ="y";

        while (ans.equals("n") == false) {
            float res = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите первое число: \n");
            float num1 = Float.parseFloat(reader.readLine());
            System.out.print("Введите операцию: \n");
            String op = reader.readLine();
            System.out.print("Введите второе число: \n");
            float num2 = Float.parseFloat(reader.readLine());

            switch (op) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    res = num1 / num2;
                    break;
            }
            System.out.println(res);
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
