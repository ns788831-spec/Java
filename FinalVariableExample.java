class BankAccount {
    final int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class FinalVariableExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                387653709,
                "Naman Sharma",
                5000.0
        );
        account.display();
    }
}