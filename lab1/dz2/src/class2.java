import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2 {
    public static void main(String[] args) throws IOException {
        String[] arr1 = {"имя1", "имя2", "имя3", "имя4"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++)   {
            if (name.equals(arr1[i])) {
                flag = true;
            }
        }
        if (flag == true)   {
            System.out.println("Имя есть в массиве");
        }
        else {
            System.out.println("Имени нет в массиве");
        }
    }
}
