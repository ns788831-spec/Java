import java.util.Scanner;
public class Assn4_Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input as String
        System.out.print("Enter Employee ID: ");
        String empIdStr = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String basicSalaryStr = sc.nextLine();

        System.out.print("Enter Bonus Amount: ");
        String bonusStr = sc.nextLine();

        Integer empId = Integer.valueOf(empIdStr);
        Double basicSalary = Double.valueOf(basicSalaryStr);
        Double bonus = Double.valueOf(bonusStr);

        if (basicSalary <= 0) {
            System.out.println("Invalid Basic Salary!");
        } else if (bonus < 0) {
            System.out.println("Invalid Bonus Amount!");
        } else {
            // Net Salary
            Double netSalary = basicSalary + bonus;

            // Display Details
            System.out.println("\nEmployee Payroll Details");
            System.out.println("Employee ID : " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Net Salary  : " + netSalary);
        }
         sc.close();
    }
}