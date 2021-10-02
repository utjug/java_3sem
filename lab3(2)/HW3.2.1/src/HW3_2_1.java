import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HW3_2_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(str);
        int count = 0;
        int lenExceptSpace = 0;
        String longestToken = "";
        int max_len = 0;

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            count += 1;
            String bufferToken = st.nextToken(" ");
            if (bufferToken.length() > max_len) {
                max_len = bufferToken.length();
                longestToken = bufferToken;
            }
            lenExceptSpace += bufferToken.length();
        }
        System.out.println(count);
        System.out.println(lenExceptSpace);
        System.out.println(longestToken);
    }
}
