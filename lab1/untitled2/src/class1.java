public class class1 {
    public static void main(String[] args)  {
        String str1 = "64";
        int a = to_int(str1);
        double b = to_double(str1);

        int b1 = (int) b;

        int c = a + b1;
        System.out.println(c);
    }

    public static int to_int(String text)   {
        int ch1 = Integer.parseInt(text);
        return ch1;
    }

    public static double to_double(String text)   {
        double ch2 = Double.parseDouble(text);
        return ch2;
    }
}
