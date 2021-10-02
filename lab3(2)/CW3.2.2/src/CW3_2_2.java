import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CW3_2_2 {
    public static void main(String[] args) throws IOException {
        String ans = "y";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!ans.equals("n")) {
            System.out.println("Пополните строку: ");
            String substring = reader.readLine();
            sb.append(substring);
            count += 1;

            System.out.println("Продолжить? (y/n)\n");
            do {
                ans = reader.readLine();
                if (!ans.equals("y") && !ans.equals("n"))   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }
        System.out.println(sb.toString());
        System.out.println(count);
    }
}
