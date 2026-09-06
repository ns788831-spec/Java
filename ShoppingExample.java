import java.util.Scanner;
public class ShoppingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name:");
        String product = sc.nextLine();
        System.out.println("Enter product quantity:");
        int quantity = sc.nextInt();
        try {
            // Checking for invalid product quantity
            if (quantity <= 0) {
                throw new Exception("Quantity must be greater than zero.");

            }
            System.out.println("Product: " + product);
            System.out.println("Quantity: " + quantity);
            System.out.println("Order placed successfully.");
        } catch (Exception e) {
            // This block catches the invalid quantity exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}