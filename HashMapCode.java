import java.util.*;
public class HashMapCode {
    
   static class HashMap<K,V>{//generics
        private class Node{
               K key;
               V value;

               public Node(K key,V value){
                this.key=key;
                this.value=value;
               }
        }

        private int n; // n 
        private int N;  
        private LinkedList<Node> bucket[]; // N - bucket.length
      
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i]= new LinkedList<>();//created Empty linkedlist
            }
        }
       private int hashFunction(K key){//
        int bi= key.hashCode();

        // 0 - N-1 (% N)
        return Math.abs(bi) % N ;
       }
       public int searchInLinkedList(K key,int bi){
             LinkedList<Node> ll= bucket[bi];
             
             for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key)
                 return i; //di 
             }
             return -1;
       }
       private  void rehash(){
          LinkedList<Node> oldBucket[]= bucket;
          bucket= new LinkedList[N*2];
           
          for(int i=0;i<N*2;i++){
            bucket[i]=new LinkedList<>();
          }
          for(int i=0 ;i<oldBucket.length;i++){
            LinkedList<Node> ll= oldBucket[i];
              for(int j=0 ;j <ll.size();j++){
                     Node node=ll.get(j);
                     put(node.key,node.value);
              }
          }
       }

        public void put(K key,V value){
             int bi=hashFunction(key);
             int di=searchInLinkedList(key,bi);
             //di=valid=(0 +) 
             //di=invalid =-1

             if(di == -1){//key doesn't exists
                   bucket[bi].add(new Node(key, value)) ;
                     n++;
             }
             else{//key exists
               Node node= bucket[bi].get(di);
                 node.value=value;
             }
             
             double lambda=(double)n/N;
             double k=2.0;
             if(lambda > k){
                //rehashing
                rehash();

             }

        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLinkedList(key,bi);
            //di=valid=(0 +) 
            //di=invalid =-1

            if(di == -1){//key doesn't exists
                  return false;
            }
            else{//key exists
              
               return  true;
            
              }
 
        }
        public V get (K key){
            int bi=hashFunction(key);
             int di=searchInLinkedList(key,bi);
             //di=valid=(0 +) 
             //di=invalid =-1

             if(di == -1){//key doesn't exists
                   return null;
             }
             else{//key exists
               Node node= bucket[bi].get(di);
                return  node.value;
             }
        }
      
        public V remove(K key){
            int bi=hashFunction(key);
             int di=searchInLinkedList(key,bi);
             //di=valid=(0 +) 
             //di=invalid =-1

             if(di == -1){//key doesn't exists
                   return null;
             }
             else{//key exists
               Node node= bucket[bi].remove(di);
               n--;
                return node.value ;
             }
        }
        public ArrayList<K> keySet(){
           ArrayList<K> keys=new  ArrayList<>();
           for(int i=0;i<bucket.length;i++){  //bi
               LinkedList<Node> ll = bucket[i];
                for(int j =0;j<ll.size();j++){ //di
                    Node node=ll.get(j);
                    keys.add(node.key);
            }
           }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

   }    

public static void main(String args[]){
  HashMap<String,Integer> map=new HashMap<>();
  System.out.println(map.isEmpty());
  map.put("India",190);
  map.put("US",120);
  map.put("Chaina",50);

  ArrayList <String> keys =map.keySet();
  for(int i=0;i<keys.size();i++){
    System.out.println(keys.get(i) + " "+ map.get(keys.get(i)));
  }
    map.remove("India");
    System.out.println(map.get("India"));
    System.out.println(map.containsKey("India"));
    System.out.println(map.isEmpty());


}
}
