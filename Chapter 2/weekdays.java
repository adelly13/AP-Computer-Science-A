import java.util.Scanner;

public class weekdays
{
    public static void main(String[] args)
    {
        String names = "SunMonTueWedThuFriSat";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a day number (0-6): ");
        int day = in.nextInt();
        String dayName = names.substring(day * 3, day * 3 + 3);
        System.out.println(dayName);
    }
}