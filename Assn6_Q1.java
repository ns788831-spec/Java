//Vehicle program demonstrating Inner Class and Anonymous Class
class Vehicle {
    String name = "Volkswagen Virtus";
    String type = "Car";
    // Inner class
    class Details {
        void display() {
            System.out.println("Vehicle Name: " + name);
            System.out.println("Vehicle Type: " + type);
        }
    }
    void action() {
        System.out.println("Vehicle is Drifting");
    }
}
public class Assn6_Q1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle.Details d = v.new Details();
        d.display();
        Vehicle a = new Vehicle() {
            void action() {
                System.out.println("Virtus is Drifting");
            }
        };
        a.action();
    }
}