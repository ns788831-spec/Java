import java.util.ArrayList;
public class Assn5_Q2 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Data Structures");
        courses.add("Operating Systems");

        System.out.println("Registered Courses:" + courses);
        courses.remove("Operating Systems");
        System.out.println("After removing course:" + courses);
        System.out.println("Size:" + courses.size());
        System.out.println("Contains Java? " + courses.contains("Java"));

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < courses.size(); i++) {
            sb.append((i + 1) + ". " + courses.get(i) + "\n");
        }
        System.out.println("Course List:");
        System.out.println(sb);
    }
}