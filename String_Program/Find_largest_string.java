package String_Program;
//.compareTo()
//in these 'a' != 'A'
//.comparetoIgnoreCase()
//in these 'a'='A'
public class Find_largest_string {
    public static String largest_str(String str[]){
      String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }

        }
        return largest;


      
    }
    public static void main(String[] args) {
        String str[]={"Apple","Banana","Kiwi","Mango"};
       System.out.println(largest_str(str));
    }
}
