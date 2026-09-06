abstract class Payment {
    abstract void pay();
    void message() {
        System.out.println("Payment processing..");
    }
}
class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}
class UPI extends Payment {
    void pay() {
        System.out.println("Payment made using UPI");
    }
}
public class PaymentExample {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay();
        p1.message();
        Payment p2 = new UPI();
        p2.pay();
        p2.message();
    }
}