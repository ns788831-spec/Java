class Parent{
    Parent(){
        System.out.println("Parent class constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class constructor");
    }
}
public class Main@{
    public Static void main(String[] args){
        new Child();
    }

}