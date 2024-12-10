package Basic_practice_code;

import java.util.Scanner;

//WAP to check if number is prim eor not.
public class Example_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==2){
            System.out.println("Number is prime");

        }
        else{
            boolean isprime=true;
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    isprime=false;
                }
                
            }
            if(isprime==true){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
            
        }

    }
}
