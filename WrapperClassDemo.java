import java.util.Scanner;

public class WrapperClassDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input as string
        System.out.print("Enter First number:");
        String str1 = sc.nextLine();
        System.out.print("Enter second number:");
        String str2 = sc.nextLine();
        //String to Wrapper Object
        Integer num1 =Integer.valueOf(str1);
        Integer num2 =Integer.valueOf(str2);
        //Wrapper Object to primitive (unboxing)
        int a= num1;
        int b= num2;
        //Basic Operations
        System.out.println("\nArithemetic Operations:");
        System.out.println("Addition="+(a+b));
        System.out.println("Subtraction="+(a-b));
        System.out.println("Multiplication="+(a*b));  
        //Primitive to Wrapper (Autoboxing)
        int x=100;
        Integer wrapperX=x;
        System.out.println("\nPrimitive to Wrapper:");
        System.out.println("Primitive value:"+ x);
        System.out.println("Wrapper object:"+wrapperX);
        //Wrapper to Primitive
        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;
        System.out.println("\nWrapper to Primitive :");
        System.out.println("Wrapper Object:"+wrapperY);
        System.out.println("Primitive value:"+y);

        
        sc.close();
    }
}

