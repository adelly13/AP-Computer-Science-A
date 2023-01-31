import java.util.Scanner;
import java.util.Arrays;

public class ReadingInputArrays {
    public static void main(String[] args) 
    {
        double [] array = new double [10000];

        Scanner in = new Scanner (System.in);

        // for (int i = 0; i < array.length; i++){
        //     System.out.print("Enter input:  ");
        //     double input = in.nextDouble();
        //     System.out.println();

        //     array [i] = input;
        // }

        // System.out.println(Arrays.toString(array));
        
        int count = 0;
        System.out.print("Enter input:  ");
        while (in.hasNextDouble() && count < array.length){

            System.out.print("Enter input:  ");
            double input = in.nextDouble();

            array [count] = input;
            count++;

        }

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
