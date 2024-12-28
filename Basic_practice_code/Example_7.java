package Basic_practice_code;
import java.util.*;
//print the table of a number input by the user.
public class Example_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<11;i++){
           System.out.println(n+"X"+i+"="+n*i);
        }

    }
}
