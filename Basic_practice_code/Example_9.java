package Basic_practice_code;
//write a program to check if number is palindrome or not.
public class Example_9 {
    public static void main(String[] args) {
        int n=1221;
        int temp=n;
        int sum=0;
        int rem=0;
        while(n > 0) {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        System.out.println(sum);
        if(temp == sum){
            System.out.println("Number is palindrome.");
        } else{
            System.out.println("Number is not palindrome.");
        }
    }
    
}
