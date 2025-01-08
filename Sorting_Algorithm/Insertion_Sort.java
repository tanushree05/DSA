class Insertion_Sort{
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void insertion_sort(int arr[]){
         
         for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement of element in sorted position

            arr[j+1]=current;
         }
         printarr(arr);

    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        insertion_sort(arr);
       
    }
}