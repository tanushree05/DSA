package Basic_practice_code;
import java.util.*;
//Write a program to find the factorial of any number entered by the user.
//factorial = 5! = 5*4*3*2*1=120
//TC=O(n)
public class Example_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
          int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
