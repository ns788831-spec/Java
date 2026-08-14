class Outer{
    private String message = "Hello from Outer Class";
    // Inner class
    class Inner {
        void display(){
            System.out.println("Message: "+message);
        }
public class InnerClasses {
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}
}
}