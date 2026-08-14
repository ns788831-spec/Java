import java.util.ArrayList;
public class TodoListExample {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java Assignment");
        tasks.add("Study for Viva");
        tasks.add("Practice java");

        System.out.println("Tasks:" + tasks);

        tasks.remove("Study for Viva");
        System.out.println("After removing task:" + tasks);

        System.out.println("Size:" + tasks.size());
        System.out.println("Contains java? " + tasks.contains("Practice java"));

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println("To-Do List:");
        System.out.println(sb);
    }
}