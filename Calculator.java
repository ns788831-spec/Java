class Calculator {

    static int count = 0;

    int add(int a, int b) {
        count++;
        return a + b;
    }

    double add(double a, double b) {
        count++;
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum = " + c.add(13, 24));
        System.out.println("Sum = " + c.add(12.5, 8.5));

        System.out.println("Calculations = " + count);
    }
}