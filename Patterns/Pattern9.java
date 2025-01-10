package Patterns;

public class Pattern9 {
    public static void fun1(int n){
        for(int i=0;i<n;i++){
            //space 
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }
    public static void fun2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i)-1;j++){
                System.out.print("*");
            }


            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int n=5;
        fun1(n);
        fun2(n);
        
    }
}
