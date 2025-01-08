class Merge_Sort{
    //Merge sort TC : O(n log n)
    public static void divide (int arr[],int si,int ei){
       //base case
       if(si>=ei){
        return;
       }
         //O(log n)

        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    public static void conqure(int arr[],int si,int mid,int ei){

        int merged[]=new int[ei-si+1];

         int indx1=si;
         int indx2=mid+1;
         int x=0;
         //O(n)
        while(indx1 <= mid && indx2 <= ei){

            if(arr[indx1] < arr[indx2]){
               merged[x++]=arr[indx1++];
            }
            else{
                merged[x++]=arr[indx2++];
            }

        }
        while(indx1 <= mid)
        {
            
                merged[x++]=arr[indx1++];
        }

        while(indx2 <= ei){
            merged[x++]=arr[indx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
         divide(arr,0,arr.length-1);

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

         }
    }
}