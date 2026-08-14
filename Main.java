class Parent{
    Parent(){
        System.out.println("Parent class const");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child class const");
    }
}
public class Main {
    public static void main(String[] args) {
    new Child();   
    }
    
}