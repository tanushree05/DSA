package Basic_practice_code;

import java.util.Scanner;

//print the table of the number input by the user.
public class Example_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
