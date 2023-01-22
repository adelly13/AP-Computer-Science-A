public class MaxMin
{
    public static void main(String[] args)
    {
        double[] values = {-3, -5, -6, -8, -1};
        double max = values[0];
        double min = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}