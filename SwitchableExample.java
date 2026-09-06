interface Switchable {
    void turnOn();
}
class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON");
    }
}
class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON");
    }
}
public class SwitchableExample {
    public static void main(String[] args) {
        Switchable s1 = new Light();
        s1.turnOn();
        Switchable s2 = new Fan();
        s2.turnOn();
    }
}