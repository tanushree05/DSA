package Stack_Program;

import java.lang.reflect.Array;

public class Stack_Prog {
    static class Stack{
         int arr[];
         int size;
         int top;
         
        Stack(int n){
             this.arr=new int[n];
             this.size=n;
             top=-1;
        }   
        
        public  boolean isEmpty(){
           return top ==-1;

        }
        public  void push(int data){
              if(top ==size-1){
                System.out.println("Stack is Overflow");
              }
              else{
                top++;
                arr[top]=data;
              }
        }
        public int pop(){
            if(isEmpty()){
                    System.out.println("Stack is underflow");
            }

            int top_ele=arr[top];
            top--;
            return top_ele;
    }

    public int  peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
        
       
    }

    } 
    public static void main(String[] args) {
        Stack s=new Stack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.err.println(s.peek());
            s.pop();
        }

    }
}
