package Basic_practice_code;

import java.util.Scanner;

//Print reverse of the number
public class Example_2 {
    public static int reverse_fun(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
             rev=(rev*10)+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      System.out.println(reverse_fun(num));
      sc.close();
    }
}
