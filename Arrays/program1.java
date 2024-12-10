package Arrays;
//Linear Search :
// Find the index of element in given array.(Linear Search)
public class program1 {
    public static int find_element(int arr[] ,int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=4;
       int result= find_element(arr,key);
       if (result==-1){
        System.err.println("Number not found");
       }
       else{
        System.out.println("Number is at index "+ result);
       }
    }
}
//input- arr[]={1,2,3,4,5}
//       key = 4
//output - Number is at index 3
