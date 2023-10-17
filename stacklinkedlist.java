public class stacklinkedlist {
    private Node head;
    private int size;


    public stacklinkedlist(){
        head=null;
        size=0;
    }

    void push(int data){
        Node temp = new Node(data);
        temp.next=head;
        head = temp;
        size++;

    }

    int pop() throws Exception{
     if(head==null){
        throw new Exception();
     }

     int res=head.data;
     head=head.next;
     size--;
     return res;
    }

    int peak() throws Exception{
        if(head==null){
            throw new Exception();
        }

        return head.data;
    }

    boolean isEmpty(){
        return head==null;
    }

   
    private class Node{
        private Node next;
        private int data;


        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public Node(int data){
            this.data=data;
        }
    }
}
