import java.util.Scanner;
public class ATMExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        System.out.println("Enter withdrawal amount:");
        int amount = sc.nextInt();
        try {
            // Checking for invalid withdrawal amount
            if (amount <= 0) {
                throw new Exception("Withdrawal amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance.");
            }
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + balance);
        } catch (Exception e) {
            // This block catches the invalid withdrawal exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}