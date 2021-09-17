import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static  void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ans1 = "y";
        String ans2 = "y";
        while (ans2.equals("n") == false) {
            System.out.println("Введите данные: ");
            String a = reader.readLine();
            System.out.println("Продолжить? (y/n)");
            do {
                ans1 = reader.readLine();
                if (ans1.equals("y") == false && ans1.equals("n") == false)   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (ans1.equals("y") == false && ans1.equals("n") == false);
            if (ans1.equals("y") == true) {
                int b = Integer.parseInt(reader.readLine());
                System.out.println("Продолжить? (y/n)");

                do {
                    ans1 = reader.readLine();
                    if (ans1.equals("y") == false && ans1.equals("n") == false)   {
                        System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                    }
                } while (ans1.equals("y") == false && ans1.equals("n") == false);

                if (ans1.equals("y") == true) {
                    double c = Double.parseDouble(reader.readLine());
                    Car car3 = new Car(a, b, c);
                    car3.show();
                }
                else {
                    Car car2 = new Car(a, b);
                    car2.show();
                }
            }
            else {
                Car car1 = new Car(a);
                car1.show();
            }
            System.out.println("Заполнить данные по следующей машине? (y/n)");
            do {
                ans2 = reader.readLine();
                if (ans2.equals("y") == false && ans2.equals("n") == false)   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (ans2.equals("y") == false && ans2.equals("n") == false);
        }
    }
}
