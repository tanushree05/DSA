package PatternProblem;
/*
print the given pattern 
1
1 2
1 2 3
1 2 3 4


*/ 
public class Pattern_6 {
    public static void main(String[] args) {
        int row=4;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
