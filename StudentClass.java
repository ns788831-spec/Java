class Student {
    String name;
    int roll_num;

    // Default Constructor
    Student() {
        name = "Charlie";
        roll_num = 110;
    }

    // Parameterized Constructor
    Student(String n, int rn) {
        name = n;
        roll_num = rn;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_num + "\n");
    }
}

public class StudentClass {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("\nDefault Constructor:");
        student1.display();

        Student student2 = new Student("Naman Sharma", 120);
        System.out.println("Parameterized Constructor:");
        student2.display();
    }
}