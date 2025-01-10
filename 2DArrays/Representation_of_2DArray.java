import java.util.Scanner;



public class Representation_of_2DArray {
    public static void main(String[] args){
        int arr[][]=new int[2][2];
         
        int n=arr.length;
        int m=arr[0].length;
         Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //get an element from an user
                arr[i][j]=sc.nextInt();
            }

        }
        //print 2D Array

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            
        }
    }
}
