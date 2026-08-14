class MethodOverLoading_StaticVariable {

    int a = 10;
    int b = 25;

    static int c;
    static int obj_count = 0;

    // Default Constructor
    MethodOverLoading_StaticVariable() {
        System.out.println("Default Constructor");
        obj_count++;
    }

    // Parameterized Constructor
    MethodOverLoading_StaticVariable(int x, int y) {
        System.out.println("Parameterized Constructor");
        a = x;
        b = y;
        obj_count++;
    }

    void add() {
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    static void showCount() {
        System.out.println("\nNumber of objects created: " + obj_count);
    }
}

public class MethodOverLoadingAndStaticVar {
    public static void main(String[] args) {

        MethodOverLoading_StaticVariable obj1 =
                new MethodOverLoading_StaticVariable();
        obj1.add();

        MethodOverLoading_StaticVariable obj2 =
                new MethodOverLoading_StaticVariable(5, 15);
        obj2.add();

        MethodOverLoading_StaticVariable obj3 =
                new MethodOverLoading_StaticVariable(23, 84);
        obj3.add();

        MethodOverLoading_StaticVariable obj4 =
                new MethodOverLoading_StaticVariable(2, 5);
        obj4.add();

        MethodOverLoading_StaticVariable.showCount();
    }
}