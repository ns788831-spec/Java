

public class NestedTryExample {
    public static void main(String[] args) {
        try{
            //Outer try block
            System.out.println("Oter try block started: ");
            try {
                // Inner try block 
                System.out.println("Inner try block started.");
                int result = 10/0; // This will cause ArithmeticException
            } catch (ArithmeticException e) {
                //Catch block for inner try
                System.out.println("Caught ArithemeticException in inner try block:"+ e.getMessage());
            }
            String str = null;
            System.out.println(str.length()); //This will cause NullPointerException 

        }catch(NullPointerException e ){
            // Catch block for outer try 
            System.out.println("Caught NullPointerexception in outer try block : "+ e.getMessage());
        }
    }
}
