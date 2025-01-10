package Arrays;

public class FibonacciSeries {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonacci(n - 1); // Fibonacci(n-1)
        int fnm2 = fibonacci(n - 2); // Fibonacci(n-2)
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
    }
}