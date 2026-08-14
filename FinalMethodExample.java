class Parent{
    final void display(){
        System.out.println("Final method in parent class ");
    }
}
class Child extends Parent{
    //void display ()//compilation error if attempted
}
public class FinalMethodExample{
    public static void main(String[] args) {
        Child c = new Child ();
        c.display();
    }
}