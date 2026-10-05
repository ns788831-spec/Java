import java.util.*;

class Course {
    String code;
    String name;
    int credits;
    Course(String code,String name,int credits) {
        this.code=code;
        this.name=name;
        this.credits=credits;
    }
}
public class CourseRegistration {
    Vector<Course> courses=new Vector<>();
    ArrayList<Course> registered=new ArrayList<>();
    void addCourse(Course c) {
        courses.add(c);
    }
    void register(String code) {
        for(Course c:registered) {
            if(c.code.equals(code)) {
                System.out.println("Duplicate registration rejected");
                return;
            }
        }
        for(Course c:courses) {
            if(c.code.equals(code)) {
                registered.add(c);
                System.out.println(code+" registered");
                return;
            }
        }
        System.out.println("Course not found");
    }
    void remove(String code) {
        for(int i=0;i<registered.size();i++) {
            if(registered.get(i).code.equals(code)) {
                registered.remove(i);
                System.out.println(code+" removed");
                return;
            }
        }
        System.out.println("Course not registered");
    }
    void search(String code) {
        for(Course c:courses) {
            if(c.code.equals(code)) {
                System.out.println("Course found: "+c.name);
                return;
            }
        }
        System.out.println("Course not found");
    }
    void show() {
        StringBuffer s=new StringBuffer();
        int total=0;
        s.append("\nRegistration Summary\n");
        for(Course c:registered) {
            s.append(c.code+" - "+c.name+" - "+c.credits+" credits\n");
            total=total+c.credits;
        }
        s.append("Total Credits: "+total);
        System.out.println(s);
    }
    public static void main(String[] args) {
        CourseRegistration obj=new CourseRegistration();
        obj.addCourse(new Course("CS101","Java Programming",4));
        obj.addCourse(new Course("CS102","Data Structures",4));
        obj.addCourse(new Course("CS103","Database Management",3));
        obj.register("CS101");
        obj.register("CS102");
        obj.register("CS101");
        obj.search("CS102");
        obj.remove("CS102");
        obj.show();
    }
}


