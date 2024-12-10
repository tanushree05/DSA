package PatternProblem;
/*
print the pattern
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
 */
public class Pattern_10 {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
               System.out.print("*"+" ");
            }
            //space 
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" "+" ");
             }
             //2nd part
             for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
             }
             System.out.println();
            
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
               System.out.print("*"+" ");
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" "+" ");
             }
             for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
             }
        System.out.println();
            
        }
    }
}
