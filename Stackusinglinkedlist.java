public class Stackusinglinkedlist {
    private Node head;
    private int size;

    
    public Stackusinglinkedlist() {
        head= null;
        size=0;
    }

    void push(int data){
        Node temp = new Node(data);
        
        size++;
        temp.next=head;
        head=temp;

    }


    int peek() throws Exception{
        if(head==null){
            throw new Exception();
        }

        return head.data;

    }

    int pop() throws Exception{
        if(head==null){
            throw new Exception();
        }

        int res= head.data;
        head = head.next;
        size--;
        return res;
    }

    boolean isEmpty(){
        return head==null;
    }

    int size(){
        return size;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data, Stackusinglinkedlist.Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

    }
}

