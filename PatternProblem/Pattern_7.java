package PatternProblem;
/*
print the given pattern 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/ 
public class Pattern_7 {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
