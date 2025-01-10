package String_Program;

public class Check_Palindrome {
    public static boolean is_Palindrome(String str){
           

           for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }

           }
           return true;

    }
    public static void main(String[] args) {
        String str="abbac";
        

        if(is_Palindrome(str)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }

    }
}
