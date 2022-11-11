import java.util.Scanner;

public class comparingnumbers {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("Enter another integer: ");
        int b = sc.nextInt();

        // if (a < b) {
        //     System.out.println("The first integer is less than the second.");
        // } else if (a > b) {
        //     System.out.println("The first integer is greater than the second.");
        // } else {
        //     System.out.println("The first integer is equal to the second.");
        // }
        System.out.println(Math.min(a, b) + " is smaller");
    }
}
