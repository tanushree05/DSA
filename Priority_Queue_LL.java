class Priority_Queue_LL{

static class Node{
    int data;
    int priority;
    Node next;

}

Node node=new Node();

static Node newNode(int d,int p){
    Node temp=new Node();
    temp. data=d;
    temp.priority=p;
    temp. next=null;

  return temp;  
}

static Node push(Node head,int d,int p){


    Node temp= newNode(d,p);

    if(head==null ||head.priority > p){
        temp.next=head;
        head=temp;
    }
    else{
        Node start=head;

        if(start.next!=null && start.next.priority < p ){
               start=start.next;
        }

        temp.next=start.next;
        start.next=temp;

    }

    return head;
}

static Node pop(Node head){

    if(head==null){
        return null;
    }
     Node temp=head;
     head=head.next;

   return head;  
}
static int peek(Node head){
    if(head==null){
        return  -1;
    }
    return head.data;
}

static int  isEmpty(Node head){
       return head==null ? 1:0;
}

    public static void main(String args[]){
         Node pr=newNode(20, 4);
         pr=push(pr,15,3);
         pr=push(pr,10,2);
         pr=push(pr,5,1);

         while(isEmpty (pr)==0 ){
            System.err.print(peek(pr)+" ");
            pr= pop(pr);
         }





    }
}