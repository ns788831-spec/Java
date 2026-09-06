abstract class FoodOrder {
    abstract void calculateBill();
    void message() {
        System.out.println("Food order details:");
    }
}
class DineInOrder extends FoodOrder {
    void calculateBill() {
        int food = 549;
        int serviceCharge = 80;
        System.out.println("Dine-In Bill = " + (food + serviceCharge));
    }
}
class TakeAwayOrder extends FoodOrder {
    void calculateBill() {
        int food = 650;
        int packingCharge = 30;
        System.out.println("Take-Away Bill = " + (food + packingCharge));
    }
}
public class FoodOrderExample {
    public static void main(String[] args) {
        FoodOrder f1 = new DineInOrder();
        f1.calculateBill();
        f1.message();
        FoodOrder f2 = new TakeAwayOrder();
        f2.calculateBill();
        f2.message();
    }
}