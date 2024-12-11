package Arrays;
//Q.Finding key is present or not in given array using binary search.
//Input- int arr[]={11,22,33,44,55,66,77,88,99,100};        
// key=100;
//output-The key is found at index :9

//Binary Search
//Prerequisite-sorted Array

public class BinarySearchProg1 {
    public static int search(int [] arr,int key){
         int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;  //to find mid 
            if(key==arr[mid]){
                   return mid;
            }
            else if (arr[mid]<key) {  
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        

        return -1;

    }

    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99,100};
        
        int key=100;
        System.out.println("The key is found at index :"+search(arr,key));
    }

}
