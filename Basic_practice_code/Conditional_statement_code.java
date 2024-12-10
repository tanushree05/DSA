package Basic_practice_code;
import java.util.*;

public class Conditional_statement_code {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select one of the following operations (1-5):\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
                break;
            case 4:
                // Check for division by zero
                if (b != 0) {
                    System.out.println("Division of " + a + " and " + b + " is " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Modulo of " + a + " and " + b + " is " + (a % b));
                break;
            default:
                System.out.println("Please select a valid option in the range of 1 to 5.");
        }
        
        sc.close();
    }
}
