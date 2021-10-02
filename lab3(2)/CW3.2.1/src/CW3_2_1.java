import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RefactorLine {
    String rawString;

    RefactorLine(String rawString) {
        this.rawString = rawString;
    }

    public void length() {
        System.out.println(rawString.length());
    }

    public void hash() {
        System.out.println(rawString.hashCode());
    }

    public void reverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = rawString.length()-1; i >= 0; i--) {
            sb.append(rawString.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public void substring() {
        boolean flag = false; //переменная для учета первых двух пробелов
        int index1 = 0;
        int index2 = 0;
        for (int j = 0; j < rawString.length(); j++) {
            if (Character.isWhitespace(rawString.charAt(j))) {
                if (!flag) {
                    index1 = j; //индекс первого пробела
                    flag = true;
                } else {
                    index2 = j; //индекс второго пробела
                    break;
                }
            }
        }

        Integer startIndex = Integer.parseInt(rawString.substring(0, index1));
        Integer endIndex = Integer.parseInt((rawString.substring(index1+1, index2)));

        if (index2 > rawString.substring(index2+1).length()) {
            //если второй индекс не найден, то отсекается весь остаток:
            System.out.println(rawString.substring(index2+1).substring(startIndex));
        } else {
            System.out.println(rawString.substring(index2+1).substring(startIndex, endIndex));
        }
    }

}

public class CW3_2_1 {

    static int commandEndIndex(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String query = "";
        String command;
        //System.out.print("Введите операцию: \n");

        while (!query.equals("exit")) {
            System.out.print("Введите операцию: \n");
            query = reader.readLine();
            if (query.equals("exit")) {
                continue;
            }

            command = query.substring(0, commandEndIndex(query));
            RefactorLine refactorLine = new RefactorLine(query.substring(commandEndIndex(query)+1)); //обрабатываемая строка

            switch (command) {
                case "length":
                    refactorLine.length();
                    break;
                case "hash":
                    refactorLine.hash();
                    break;
                case "reverse":
                    refactorLine.reverse();
                    break;
                case "substring":
                    refactorLine.substring();
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }
}

