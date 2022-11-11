import java.util.Scanner;

public class temperature {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double maxtemp = 0;
        int currmonth = 0;
        int month = 0;
        while (in.hasNextDouble() && currmonth < 11) {
            double temp = in.nextDouble();
            currmonth++;
            if (temp > maxtemp) {
                maxtemp = temp;
                month = currmonth;
            }
        }
        System.out.println("The maximum temperature was " + maxtemp + " in month " + month);
    }
}
