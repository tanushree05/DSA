package Arrays;

//Q.Program to find max subarray sum in array using bruteforce approach.TC=O(n^3)
public class MaxSubarraySum {
    public static void maxSubarraySum(int arr[]) {
        int max = Integer.MIN_VALUE; // To store the maximum subarray sum
        int currsum; // Variable to store the current subarray sum

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0; // Reset currsum for each subarray
                for (int k = i; k <= j; k++) {
                    currsum += arr[k]; // Accumulate sum of the current subarray
                }
                System.out.println(currsum); // Print the current subarray sum
                if (max < currsum) {
                    max = currsum; // Update max if currsum is greater
                }
            }
        }
        System.out.println("The maximum subarray sum is " + max);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarraySum(arr); // Call the function with the test array
    }
}
/*
1
-1
5
4
7
-2
4
3
6
5
8
-1
2
3
The maximum subarray sum is 8 
*/
