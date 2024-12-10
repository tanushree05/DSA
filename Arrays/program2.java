package Arrays;
//Find key from String type data 
//input - fruit[]={"apple","mango","banana","orange","kiwi"}
//        key="mango"
//output- key is found at index 1
public class program2 {
    public static int linearsearch(String arr[],String key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana","orange","kiwi"};
        String key="mango";
        int result=linearsearch(fruit,key);
        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("key is found at index "+result);
        }
    
    }
}
