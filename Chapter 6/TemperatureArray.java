import java.util.Scanner;

public class TemperatureArray 
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[1000];
        int counter = 0;
        while (sc.hasNextDouble()) {
            temp[counter] = sc.nextDouble();
            counter++;
        }
        for (int i = 0; i < counter; i++) {
            System.out.println(temp[i]);
        }   
    }
}