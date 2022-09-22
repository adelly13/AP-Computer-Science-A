import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total book price: ");
        double totalBookPrice = sc.nextDouble();
        System.out.print("Enter the number of books: ");
        int numberOfBooks = sc.nextInt();
        
        double tax = totalBookPrice * 0.075;
        int shippingCharge = 2 * numberOfBooks;
        double totalCost = totalBookPrice + tax + shippingCharge;
        System.out.printf("Total cost: $%.2f", totalCost);
    }
}