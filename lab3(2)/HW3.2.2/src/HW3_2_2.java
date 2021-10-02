import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3_2_2 {
    public static long noBuilderTest(String s) {
        String root = "";
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            root += s;
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Время конкатенации без билдера: " + (timeEnd - timeStart));
        return timeEnd - timeStart;
    }

    public static long BuilderTest(String s) {
        StringBuilder sb = new StringBuilder();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(s);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Время конкатенации с билдером: " + (timeEnd - timeStart));
        return timeEnd - timeStart;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        long testTime1 = noBuilderTest(str);
        long testTime2 = BuilderTest(str);
        System.out.println("Билдер оказался быстрее на " + (testTime1 - testTime2));
    }
}
