package Basic_practice_code;

import java.util.Scanner;

//loops
//Print sum of first n natural number
public class Example_1 {
 public static int fun_sum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    return sum;
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
      System.out.println(fun_sum(n));
    }

}
