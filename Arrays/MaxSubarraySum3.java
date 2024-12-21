package Arrays;
//Optimzed Solution TC=O(n)
//Kandal's Algorithm
//  +ve ++ve =+ value
//  +ve + small(-ve) =+ value
//  +ve + large(-ve) = -ve value


public class MaxSubarraySum3 {
     public static void findMaxSubarraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];

            if(currsum < 0){
                max=Math.max(currsum,max);  
            }    

        }
        System.out.println("Maximum subarray sum : "+ max);

     }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        findMaxSubarraySum(arr);
    }
    
}
