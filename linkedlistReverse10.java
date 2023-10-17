public class linkedlistReverse10 {
    public static void main(String[] args) {
        
    }

    private Node head;
    private Node tail;

    private int size;
 
 
   


    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }

        reverse(node.next);

        
        tail.next=node;
        tail=node;
        tail.next=null;
        }
    


    private void reverseIterative(){
        if(size<2){
            return;
        }

        Node prev =null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
            next=next.next;
            }
        }

        head=prev;

    }


    private Node reverseIterativemethod2(Node node){
        // if(size<2){
        //     return;
        // }

        Node prev =null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
            next=next.next;
            }
        }

        return prev;

    }




    class Node{
        private int value;
         Node next;
         Node prev;

        public Node(int value, linkedlistReverse10.Node next, linkedlistReverse10.Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value) {
            this.value = value;
        }
        
        
        
    }
}

