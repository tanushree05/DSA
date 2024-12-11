package Arrays;
//Program to print all pairs in array 
//TC= O(n^2) becase of nested array
public class FindPairInArrayProg {
    public static void print_Pairs(int arr[]){
    int tp=0; //this is to check how many no of pairs are present for given array
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
           for(int j=i+1;j<arr.length;j++){
              System.out.print("("+curr+","+arr[j]+")");
              tp++;
           }
           System.out.println();
        } 
        System.out.println(tp);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print_Pairs(arr);
    }
}
