//package 2DArrays;

public class Max_sum_in_2DArray {
    public static int found_maxSum(int arr[][]){
        int max_sum=Integer.MIN_VALUE;
  int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
                if(sum > max_sum){
                    max_sum=sum;
                }
            }
            
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(found_maxSum(arr));

    }
}
