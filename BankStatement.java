class BankAccount {
    int balance = 1000;
    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount +
                           " | Balance: " + balance);
    }
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount +
                               " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
class DepositThread extends Thread {
    BankAccount account;
    DepositThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.deposit(500);
    }
}
class WithdrawThread extends Thread {
    BankAccount account;
    WithdrawThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw(700);
    }
}
public class BankStatement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        for (int i = 0; i < 5; i++) {
            DepositThread d = new DepositThread(account);
            WithdrawThread w = new WithdrawThread(account);
            d.start();
            w.start();
        }
    }
}