import java.util.Arrays;

public class Separators
{
    public static void main(String[] args)
    {
        String [] values = { "dog" , "cat" , "pig", "chicken", "panda"};

        for (int i = 0; i < values.length - 1; i++)
        {
            System.out.print(values[i] + ", ");
        }

        System.out.println(values[values.length-1]);

        System.out.println(Arrays.toString(values));
    }
}