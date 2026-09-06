import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class EmployeeFile {
    public static void main(String[] args) {
        try {
            // Writing to the file
            FileWriter writer = new FileWriter("employee.txt");
            writer.write("Employee ID: 120\n");
            writer.write("Employee Name: Naman\n");
            writer.write("Employee Salary: 54010");
            writer.close();
            // Reading from the file
            FileReader reader = new FileReader("employee.txt");
            int ch;
            System.out.println("Employee Details:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occured : " + e.getMessage());
        }
    }
}