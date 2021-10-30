import java.io.IOException;
import java.util.Scanner;

public class CW5_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        String s;
        int arrIndx;
        arrIndx = 0;
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.print("Please, enter some number: ");
                s = scanner.nextLine();
                try {
                    int newInt = Integer.parseInt(s);
                    arr[arrIndx] = newInt;
                    arrIndx++;
                    break;

                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    // Вывод сообщения, содержащегося в объекте исключения e
                    System.out.println("Message: " + e.getMessage());
                }
            }
        }
    }
}
