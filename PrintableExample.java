interface Printable {
    void print();
}
class Student implements Printable {
    public void print() {
        System.out.println("Student details are displayed.");
    }
}
class Employee implements Printable {
    public void print() {
        System.out.println("Employee details are displayed.");
    }
}
public class PrintableExample {
    public static void main(String[] args) {
        Printable p1 = new Student();
        p1.print();
        Printable p2 = new Employee();
        p2.print();
    }
}