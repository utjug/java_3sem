import java.io.IOException;

public class class5 {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 5, 6, 1};
        int[] arr2 = {2, 2, 2, 4, 6, 1};

        for (int i = 0; i < arr1.length; i++)   {
            if (arr1[i] != arr2[i]) {
                System.out.println(i);
            }
        }
    }
}
