class Bubble_Sort{
    //Time Complexity = O(n^2)
    
    public static void bubble_sort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j] >arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        bubble_sort(arr);
        printarr(arr);
    }
}