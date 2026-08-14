class FoodDelivery {
    String food = "Pizza";
    // Inner class
    class Order {
        void display() {
            System.out.println("Food: " + food);
        }
    }
    void status() {
        System.out.println("Order is placed");
    }
}
public class Assn6_Q2 {
    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();
        FoodDelivery.Order o = f.new Order();
        o.display();
        FoodDelivery a = new FoodDelivery() {
            void status() {
                System.out.println("Order is delivered");
            }
        };

        a.status();
    }
}