public class SumAverage
{
    public static void main(String[] args)
    {
        double[] values = {6, 1, 9, 5, 2};

        double sum = 0;
    
        for (double value : values)
        {
            sum += value;
        }

        double average = sum / values.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}