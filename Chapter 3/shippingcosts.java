// Adelina Chau Period 2

import java.util.Scanner;

public class shippingcosts {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two-letter state code: ");
        String state = sc.next();
        System.out.print("Enter the price: ");
        double cost = sc.nextDouble();
        
        // Calculates the Tax
        double tax = 0;
        if (state.equals("CA")) {
            tax = cost * 0.0725;
        }
        else if (state.equals("FL")) {
            tax = cost * 0.06;
        }

        // Calculates the Shipping;
        double shipping = 10;
        if (state.equals("HI")) {
            if (cost > 50) {
                shipping = 7;
            }
        }
        else if (!state.equals("AK")) {
            if (cost > 30) {
                shipping = 0;
            }
        }

        // Displays costs
        System.out.printf("Subtotal: %12.2f \n", cost);
        System.out.printf("Shipping: %12.2f \n", shipping);
        System.out.printf("Taxes: %15.2f \n", tax);
        System.out.printf("Total: %15.2f \n", cost + tax + shipping);
    }
}
