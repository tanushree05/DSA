package Basic_practice_code;
//Write a program to reverse a given number.
public class Example_8 {
    public static void main(String[] args) {
        int num=12345;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
    
}
