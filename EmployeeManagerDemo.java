class Employee{
    String name = "Naman";
    int salary = 30000;

    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee{
    void display(){
        super.display(); //Calls parent class method
        System.out.println("Manager Department: IT");
    }
}

public class EmployeeManagerDemo{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}