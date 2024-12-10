package Arrays;
/** Linear Search:
 *  Find the largest and smallest number in a given array.
 * Input - int arr[]={44,55,6,3,88,99};
 * output - The largest number is : 99
            The smallest number is : 3
 **/
public class program3 {
    public static int largeat_num(int arr[]){
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];

        }
      }
              return largest;
    }
    public static int smallest_num(int arr[]){
      int smallest=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
        }
      }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={44,55,6,3,88,99};
       System.out.println("The largest number is : "+ largeat_num(arr));
      System.out.println("The smallest number is : "+smallest_num(arr));

    }
}
