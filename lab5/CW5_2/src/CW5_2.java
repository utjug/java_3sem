import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CW5_2 {

    public static ArrayList<String> splitSpaces(String originalStr) throws MyException {;
        ArrayList<String> words = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(originalStr, " ");
        while(st.hasMoreTokens()){
            words.add(st.nextToken()) ;
        }

        if (words.size() == 1 || words.size() == 0) {
            throw new MyException("No spaces found in original string");
        }
        return words;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string: ");
        String s = scanner.nextLine();
        ArrayList<String> tokens = new ArrayList<>();
        try {
            tokens = splitSpaces(s);
            System.out.println(tokens);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
