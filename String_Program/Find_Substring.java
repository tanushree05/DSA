//package String_Program;

public class Find_Substring {
    public static String  substring(String str,int si,int ei){
        String str1_subString=" ";

         for(int i=si;i<=ei-1;i++){
            str1_subString+=str.charAt(i);
         }
         return str1_subString;
    }
    public static void main(String[] args) {
        String str="Hello World";
         //output: Hello
        System.out.println(substring(str,0,5));

    }
    
}
