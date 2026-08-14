public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After Append :"+sb);
        sb.insert(6,"Java ");
        System.out.println("After Insert :"+sb);

    }
}
