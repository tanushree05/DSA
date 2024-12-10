public class Tries_Data_structure {
    static class Node {
        Node[] children;
        boolean eow; // end of word
        
        public Node() {
            children = new Node[26]; // initialize the children array with 26 nulls
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow = false;
        }
    }
    
    static Node root = new Node();

    public static void insert(String words) { // O(L) - l(lengthof word)
        Node curr=root;

        for (int i = 0; i < words.length(); i++) {
            int idx=words.charAt(i)-'a';
            if(curr.children[idx] ==null){
                curr.children[idx]=new Node(); 
            }
            if(i== words.length()-1){
                curr.children[idx].eow = true;
            }
            curr=curr.children[idx];
        }
        //curr.eow = true; 
    }
    public static boolean search(String words) { //O(L)
        Node curr=root;

        for (int i = 0; i < words.length(); i++) {
            int idx=words.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(curr.children[idx].eow == false && i == words.length()-1){
                     return false;
            }
            curr=curr.children[idx];
        }

        return true;
    }
public static boolean wordBreak(String key){   //Q ask in google
    //base case
    if(key.length()==0){
        return true;
    }
    for(int i=1; i<=key.length(); i++){
         String firstPart=key.substring(0,i);
         String secondPart=key.substring(i);
         if(search(firstPart) && wordBreak(secondPart)){
            return true;
         }

    }
    
    return false;
}
public static boolean startWith(String prefix){
    if(prefix.length() == 0){
        return true;
    }
    Node curr=root;
    for(int i=0;i<prefix.length();i++){
        int idx=prefix.charAt(i) -'a';
         if(curr.children[idx]==null){
            return false;
         }
         curr=curr.children[idx];
    }
    return true;
}

public static int countNode(Node root) {

    if(root ==null){
        return 0;
    }
    int count=0;
    for(int i=0;i<26;i++){
        if(root.children[i] !=null){
            count+=countNode(root.children[i]);
        }
        
    }
    return count+1;
    
}
public static String ans="";
public static void longest_Word_With_All_Prefix(Node root , StringBuilder  temp){
   ///base case
   if(root ==null){
         return ;
   }

    Node curr=root;
    for (int i = 0; i < 26; i++) {
        
           if(root.children[i]!=null && root.children[i].eow== true)
              {
                 temp.append((char) (i+'a'));
                 if(temp.length() > ans.length()){
                    ans=temp.toString();
                 }
                 longest_Word_With_All_Prefix(root.children[i], temp);
                 temp.deleteCharAt(temp.length()-1);
            }
        
        
    }
    
}


public static void main (String args[]){
//   String words[]={"i","like","sam","samsung","mobile","ice"};
//   String key="ilikesung";
//   for(int i=0;i<words.length;i++) {
//       insert(words[i]);
//   }
//   System.out.println(wordBreak(key));

//   String words[]={"apple","app","mango","man","woman"};
//   for (int i = 0; i < words.length; i++) {
//       insert(words[i]);
//   }
//   String prefix="app";
//   System.out.println(startWith(prefix));
//   String prefix1="moon";
//   System.out.println(startWith(prefix1));


//   String str="ababa";
   
//   for(int i=0;i<str.length();i++){
//     //find all suffix of string 
//     String suffix=str.substring(i);
//         insert(suffix);
//   }
//   System.out.println(countNode(root));


String words[]={"a","banana","app","appl","ap","apply","apple"};
for (int i = 0; i < words.length; i++) {
    insert(words[i]);
}
longest_Word_With_All_Prefix(root, new StringBuilder(""));
System.err.println(ans);

}
 }
