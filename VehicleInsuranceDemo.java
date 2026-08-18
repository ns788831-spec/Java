class Vehicle{
    String vehicleNumber = "DL01AB1234";
    String vehicleType = "Car";

    void display(){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
class Insurance extends Vehicle{
    void display(){
        super.display(); //Calls parent class method
        System.out.println("Insurance Type: Comprehensive");
    }
}
public class VehicleInsuranceDemo{
    public static void main(String[] args) {
        Insurance i = new Insurance();
        i.display();
    }
}