import java.util.Scanner;
import java.util.*;
// love babbar

public class BinaryTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        Node root=null;
        //  root = BuildTree(root);
        sc= new Scanner(System.in);
        root = BuildTree(root);
        levelordertraversal(root);

    }
    
    static Node BuildTree(Node root){
        // Node root =null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        root = new Node(data);
        if(data==-1){
            return null;
        }
        
        System.out.println("Enter data for inserting in left of"+data);
        root.left=BuildTree(root.left);
        System.out.println("Enter data for inserting in right of"+data);
        root.right=BuildTree(root.right);
        return root;
        
    }
    
//    static void levelordertraversal(Node root){
//         // Queue<Node> q;
//         Queue<Node> q = new ArrayDeque<>();
//         q.offer(root);
//         q.offer(null);

//         while(!q.isEmpty()){
//             Node temp=q.element();
//             System.out.print(temp.data+" ");
//             q.poll();

//             if(temp==null){
//                 //purana level comlete traverse ho chuka hai
//                 System.out.println();
//                 if(!q.isEmpty()){
//                     // quqeue still has some child nodes
//                     q.offer(null);
//                 }
//             }
//           else{  
//         if(temp.left!=null){
//             q.offer(temp.left);
//         }

//         if(temp.right!=null){
//             q.offer(temp.right);
//         }
//         }
//     }
        


//     }
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    
}
