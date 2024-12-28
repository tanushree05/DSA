package Basic_practice_code;
import  java.util.*;
//Write a program to check number is prime or not.
// if num=2 -- prime if num =num x 1 ornum=  1 x num then prime
//else false 
public class Example_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n == 2){
            System.out.println("Number is prime");
        }
        else if(n<=1){
            System.out.println("Number is not prime");
        } 
        else{
               boolean is_prime=true;

               for(int i=2;i<=n-1;i++){// TC =O(n^2)
                //optimized approach is 
                /*for(int i=2;i<=Math.sqrt(n);i++) {
                    if(n%i ==0){
                        is_prime=false;
                        break;
                    }
                 }
                    */
                    if(n%i ==0){
                        is_prime=false;
                        break;
                    }

               }
               if(is_prime == true){
                System.out.println("Number is prime");
               }
               else{
                System.out.println("Number is not prime");
               }
        }
    }
    
}
