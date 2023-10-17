// import QueueUsingLL.Queue;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    static Scanner sc =null;
    

    public static void main(String[] args) {
        // love babba
        sc= new Scanner(System.in);

    }

     void levelordertraversal(Node root){
        // Queue<Node> q;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node temp=q.element();
            System.out.print(temp.data+" ");
            q.poll();

        if(temp.left!=null){
            q.offer(temp.left);
        }

        if(temp.right!=null){
            q.offer(temp.right);
        }
        }
        


    }
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
          left=right=null;
        }
    
}
}
