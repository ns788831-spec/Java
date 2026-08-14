import java.util.Scanner;
public class Assn_fourth_Question_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input as String
        System.out.print("Enter marks of first subject: ");
        String s1 = sc.nextLine();

        System.out.print("Enter marks of second subject: ");
        String s2 = sc.nextLine();

        System.out.print("Enter marks of third subject: ");
        String s3 = sc.nextLine();

        Integer marks1 = Integer.valueOf(s1);
        Integer marks2 = Integer.valueOf(s2);
        Integer marks3 = Integer.valueOf(s3);

        int m1 = marks1;
        int m2 = marks2;
        int m3 = marks3;
        // Total Marks
        int total = m1 + m2 + m3;

        System.out.println("\nStudent Marks:");
        System.out.println("Subject 1 = " + m1);
        System.out.println("Subject 2 = " + m2);
        System.out.println("Subject 3 = " + m3);
        System.out.println("Total Marks = " + total);

        sc.close();
    }
}