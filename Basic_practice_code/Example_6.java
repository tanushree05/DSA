package Basic_practice_code;
// Write a program to print sum of N natural number;
//Input: n=10;
//output:  Sum of N natural number is :55
        
class Example_6{
    public static void print_Sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++) { 
            sum+=i;
        }
        System.out.println("Sum of N natural number is :"+ sum);
    }
    public static void main(String[] args) {
        int n=10;
        print_Sum(n);
    }

}