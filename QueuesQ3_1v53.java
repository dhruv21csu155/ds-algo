public class QueuesQ3_1v53 {
    public static void main(String[] args) {
        
    }

    static Node head;
    class Node{
        int data;
        Node next,child;

        public Node(int data) {
            this.data = data;
            next=child=null;
        }

    }

    void flattenList(Node node){   //node is basically head node

        // base case
        if(node==null){
            return;
        }

        Node temp=null;

        // find tail node of first level linked list
        Node tail=node;
        while(tail.next!=null){
            tail=tail.next;
        }

        // one by one traverse through all nodes of first level
        // linked list till we reach the tail node

        Node cur=node;
        while(cur!=tail){

            // if current node has a child
            if(cur.child!=null){

                // then append the child at the end of current list
                tail.next=cur.child;

                // and update the tail to new last node
                temp=cur.child;
                while(temp.next!=null){
                    temp=temp.next;
                }
                tail = temp;
            }

            // change current node
            cur=cur.next;
        }
    }
}
