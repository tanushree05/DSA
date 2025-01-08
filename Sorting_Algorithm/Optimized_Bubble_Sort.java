class Optimized_Bubble_Sort{
    //Time Coplexity= O(n)
        public static void bubble_sort(int arr[]){
            boolean swap;

            for(int i=0;i<arr.length-1;i++){
                swap=false;
                for(int j=0;j<arr.length-1;j++){
                     if(arr[j] > arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swap=true;
                     }
                     
                }
                if(swap==false){
                    break;
                }
            }

        }
        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        }

        public static void main(String args[]){

        int arr[]={1,2,3,4,5};
        bubble_sort(arr);
        printarr(arr);
    }
}