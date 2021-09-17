public class class2 {
    public static void main(String[] args)  {
        //prll
        float prll_length = 2;
        float prll_width = 3;
        float prll_height = 4;

        float prll_volume = prll(prll_length, prll_width, prll_height);
        System.out.println(prll_volume);

        //sphere

        float sphere_r = 6;

        double sphere_volume = sphere(sphere_r);
        System.out.println(sphere_volume);

        //clndr

        float clndr_r = 3;
        float clndr_height = 5;

        double clndr_volume = clndr(clndr_r, clndr_height);
        System.out.println(clndr_volume);
    }

    public static float prll(float a, float b, float c)   {
        float ch1 = a*b*c;
        return ch1;
    }

    public static double sphere(float a)   {
        double ch1 = (4.0/3)*Math.PI*Math.pow(a, 3);
        return ch1;
    }

    public static double clndr(float a, float b)   {
        double ch1 = Math.PI*Math.pow(a, 2)*b;
        return ch1;
    }
}
