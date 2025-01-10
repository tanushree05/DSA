import java.util.Scanner;



public class Search_key_from_2Darray {
    public static void search_key(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key Found"+i+" "+j);
                }
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr=new int [3][3];
        int key=10;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //print matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        search_key(arr,key);
    }
}
