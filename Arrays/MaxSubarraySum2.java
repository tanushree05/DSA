//Write a program to find maximum subarray sum 
//better approach O(n^2) 
// In this approach we are adding previous currsum value to the next array 
//index value that help us to do not caculate sum again and again from starting index
//output : maximum subarray sum is : 8 
public class MaxSubarraySum2 {
     public static void findsubarray(int arr[]){
            int max=Integer.MIN_VALUE;
            int currsum;
        for(int i=0;i<arr.length;i++){
            currsum=0;
            for(int j=i;j<arr.length;j++){
                 currsum += arr[j];
                if(currsum > max){
                     max = currsum;
            }
            }
        }
        System.out.println("maximum subarray sum is : "+max);

     }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        findsubarray(arr);


    }
}
