//Normal Class
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
public class InnerAnonymousDemo{
    public static void main(String[] args) {
        //Demonstrating Anonymous Class
        Animal a = new Animal(){
            void sound() {
                System.out.println("Dog barks");
            }
        };
        a.sound();
    }
}