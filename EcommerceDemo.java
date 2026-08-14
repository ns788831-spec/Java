interface Product{
    void display();
}
class Electronic implements Product{
    public void display(){
        System.out.println("Electronic Product: Laptop");
    }
}
class Clothing implements Product{
    public void display(){
        System.out.println("Clothing Product: T-Shirt");
    }
}
class Grocery implements Product{
    public void display(){
        System.out.println("Grocery Product: Rice");
    }
}
public class EcommerceDemo{
    public static void main(String[] args) {

        Product e = new Electronic();
        e.display();

        Product c = new Clothing();
        c.display();

        Product g = new Grocery();
        g.display();
    }
}