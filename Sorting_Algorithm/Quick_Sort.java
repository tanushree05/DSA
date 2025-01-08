

class Quick_Sort{
    public static void quick_sort(int arr[],int low,int high){

        if(low < high){

            int pivot_index=partition(arr,low,high);
            quick_sort(arr,low,pivot_index-1);
            quick_sort(arr,pivot_index+1,high);
        }
    }

    public static int partition(int arr[],int low,int high){
        
        int pivot=arr[high];
         
        int i=low-1;

        for(int j=low;j<high;j++){

            if(arr[j]<pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        
        i++;
       int temp=arr[high];
       arr[high]=arr[i];
       arr[i]=temp;

       return i; //pivot index

    }
    public static void main(String[] args){
        int arr[]={5,6,8,2,1,9,7};
        quick_sort(arr,0,arr.length-1);

        // print arr

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}