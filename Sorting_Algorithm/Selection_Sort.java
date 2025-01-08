/*
Selection sort:
Idea- pick the smallest element (from unsorted) put it at the begining
Time Complexity=O(n^2)
 */


class Selection_Sort{
    public static void selection_sort(int arr[]){
        //Time Complexity= O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,6,8,1,2,9};
        selection_sort(arr);
        printarr(arr);
            }
}