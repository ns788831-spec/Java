public class Excp {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        String s= null;
        try{
            // int res=n1/n2
            //System.out.println("Result:"+ res);
            System.out.println("Length of String :"+ s.length());
        }catch(ArithmeticException |NullPointerException e ){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
