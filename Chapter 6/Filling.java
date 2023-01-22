public class Filling
{
    public static void main(String[] args)
    {
        // create an array named values that can hold 10 double values
        double[] values = new double[10];

        // use a loop to fill the array with squares (0, 1, 4, 9, 16, ...)
        // for (int i = 0; i < values.length; i++ ) {
        //     values[i] = i*i;
        // }

        // for (int i = 0; i < values.length; i++ ) {
        //     values[i] = i+1;
        // }

        // for (int i = 0; i < values.length; i++) {
        //     values[i] = i*2;
        // }

        // for (int i = 0; i < values.length; i++) {
        //     values[i] = (i+1)*(i+1);
        // }

        // for (int i = 0; i < values.length; i++) {
        //     values[i] = 0;
        // }

        // double[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        // for (int i = 0; i < values.length; i++) {
        //     values[i] = i%2;
        // }

        for (int i = 0; i < values.length; i++) {
            values[i] = i%5;
        }

        // then use an enhanced for loop to print the array
        for (double value : values) {
            System.out.println(value);
        }
    }
}