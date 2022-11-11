import java.util.Scanner;

public class absolutevalue {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();

        int y = x;

        if (x < 0) {
            y = -x;
        }
        System.out.println(y);
    }
}
