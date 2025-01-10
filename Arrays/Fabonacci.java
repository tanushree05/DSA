package Arrays;
//print fabonacci series

public class Fabonacci {
    public static void fab_series(int n) {
        if(n<=0){
            System.out.println("Invalid number ");
        }
    int a=0;
    int b=1;
        for(int i=0;i<=n;i++){
            System.out.print(a);
            int next=a+b;
            a=b;
            b=next;
        }

        
    }
    public static void main(String[] args) {
        int n=5;
        fab_series(n);
    }
}
