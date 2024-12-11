package Arrays;
//Q.Write a program to print subarray .
//subarray- a continuous part of array
public class FindSubarray {
public static void print_subarray(int arr[]){
    int ts=0;

    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
            
            ts++;
            System.out.println();
        }
        
    }
    System.out.println("Number of subpair is :"+ts);
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print_subarray(arr);
    }
}

/*
Output:
1 
1 2       
1 2 3     
1 2 3 4   
1 2 3 4 5 
2         
2 3       
2 3 4     
2 3 4 5   
3         
3 4
3 4 5
4
4 5
5
Number of subpair is :15
 */