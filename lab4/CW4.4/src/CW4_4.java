import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class CW4_4 {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> personAge = new HashMap<String, Integer>();
        personAge.put("name1", 13);
        personAge.put("name2", 67);
        personAge.put("name3", 81);
        personAge.put("name4", 21);

        for (Map.Entry person : personAge.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }

        String ans = "y";

        while (!ans.equals("n")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите ключ\n");
            String key = reader.readLine();
            if (personAge.containsKey(key)) {
                System.out.println(personAge.get(key));
            } else {System.out.println("Нет такого ключа");}

            System.out.print("Введите значение: \n");
            Integer value = Integer.parseInt(reader.readLine());
            if (personAge.containsValue(value)) {
                for (Map.Entry e : personAge.entrySet()) {
                    if (e.getValue() == value) {
                        System.out.println(e.getKey());
                    }
                }
            } else {System.out.println("Нет такого значения");}

            System.out.println("Продолжить? (y/n)\n");

            do {
                ans = reader.readLine();
                if (!ans.equals("y") && !ans.equals("n"))   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }
    }
}