import java.util.Arrays;
import java.util.Random;

public class class6 {
    public static void main(String[] args) {

        int[] arr1 = new int[15];
        for (int i=0; i<15; i++)    {
            arr1[i] = new Random().nextInt(33);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOfRange(arr1, 5, 10);
        System.out.println(Arrays.toString(arr2));
    }
}
