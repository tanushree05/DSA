package Basic_practice_code;

import java.util.Scanner;

//WAP to print factorial of a number
public class Example_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
           fact=fact*i; 
        }
System.out.println("Factorial of "+num+" is "+fact);
    }
}
