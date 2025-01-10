package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
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
    
}
