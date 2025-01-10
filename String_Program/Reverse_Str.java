

public class Reverse_Str {
    public static String reverse_Str(String Str){
        StringBuilder sb=new StringBuilder(Str);

      for(int i=0;i<sb.length()/2;i++){
          
        int front=i;
        int back=sb.length()-i-1;
          char frontchar=sb.charAt(front);
          char backchar=sb.charAt(back);

          sb.setCharAt(front, backchar);
          sb.setCharAt(back, frontchar);
          



      }

      return sb.toString();
    }
    public static void main(String[] args) {
       
        String str="Tanu";
        System.out.println(reverse_Str(str));
    }
}
