import java.util.ArrayDeque;
import java.util.Queue;
public class QueuesQ3v52 {
    public static void main(String[] args) {
        // Anuj Bhaiya
        // Flatter a Multilevel Linked list using queues
    }
// time complexity of below code is  O(N)

class Main{
    //function to convert a multi level linked list int a singly linked list
    public static Node convertList(Node head){
        Node curr = head;
        Queue<Node> q = new ArrayDeque<>();
        
        // process all nodes
        while(curr!=null){
            
            // last Node is reached
            if(curr.next==null){
                // deque the front node and set it as the next node
                // of the current node
                curr.next=q.poll();
            }
            
            // if the current node has a child
            if(curr.child!=null){
                q.add(curr.child);
            }
            
            // advance the current node
            curr=curr.next;
        }
        return head;
    }
}
class Node{
    int data;
    Node next;
    Node child; //down pointer

    public Node(int data, QueuesQ3v52.Node next, QueuesQ3v52.Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }

    
}
}
