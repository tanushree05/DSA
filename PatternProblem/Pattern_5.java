package PatternProblem;
/*
print the given pattern 
        *
      * *
    * * *
* * * * *

*/ 
public class Pattern_5 {
    public static void main(String[] args) {
        int row=4;
        int col=4;
       //outer loop
        for(int i=1;i<=row;i++){
            //inner loop -> space
            for(int j=1 ;j<=row-i;j++){
                System.out.print(" "+" ");
            }
            //inner loop 
         for(int j=1;j<=i;j++){
                 System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
        
}

