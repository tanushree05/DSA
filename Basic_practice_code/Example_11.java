package Basic_practice_code;
//Write a program that reads a set of integers and then print the sum of the even and odd integer.
//even= 2+4+6+8+10=30
//odd = 1+3+5+7+9=25
//input : num[]={1,2,3,4,5,6,7,8,9,10}
//output :Sum of even number : 30
//        Sum of odd number : 25
public class Example_11 {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int even_sum=0;
        int odd_sum=0;

        for(int i=0;i<num.length;i++){
            if(num[i]%2 ==0){
                even_sum+=num[i];
            }
            else{
                odd_sum+=num[i];
            }
        }

        System.out.println("Sum of even number : "+even_sum);
        System.out.println("Sum of odd number : "+odd_sum);

    }
    
}
