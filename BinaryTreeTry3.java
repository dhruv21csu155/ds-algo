import java.text.NumberFormat.Style;
import java.util.Scanner;
import java.util.*;
// anuj bhaiya
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class BinaryTreeTry3 {
    static Scanner sc =null;
    public static void main(String[] args) {
         sc= new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println(height(root));
        System.out.println(Maximum(root));
        printOrderTraversal(root);
        System.out.println();
        printOrderTraversalTree(root);
        System.out.println();
        convertToDLL(root);      
    }
// 2,4,7,6,-1,-1,-1,-1,1,8,-1,3dfwxq    0,-1,-1


    static Node createTree(){
        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }

        root=new Node(data);

        System.out.println("Enter left for:"+data);
        root.left=createTree();

        System.out.println("Enter right for:"+data);
        root.right=createTree();

        return root;
    }

    
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    static void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    
    // q1 video 57
    // heigth of binary tree
    static int height(Node root){
        if(root==null){
            return 0;
    }


    return Math.max(height(root.left),height(root.right))+1;
}


// q2 video 58
// size of binary tree=no.of nodes in a tree

static int size(Node root){
    if(root==null){
        return 0;
    }

    return size(root.left) +size(root.right) +1;
}


// q3 v58
// max value in a binary Treet

static int Maximum(Node root){
    if(root==null){
        return Integer.MIN_VALUE;
    }

    return Math.max(root.data , Math.max(Maximum(root.left),Maximum(root.right)));
}



// q4 v59************
static void printOrderTraversal(Node root){
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
        Node curr = q.poll();
        System.out.print(curr.data+" ");

    if(curr.left!=null){
        q.add(curr.left);
    }

    if(curr.right!=null){
        q.add(curr.right);
    }
    }
}

// V59*************
static void printOrderTraversalTree(Node root){    //time complexity - O(N)
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node curr = q.poll();

        if(curr==null){
            if(q.isEmpty()){
                return;
            }
            q.add(null);
            System.out.println();
            continue;
        }
        System.out.print(curr.data+" ");


    if(curr.left!=null){
        q.add(curr.left);
    }

    if(curr.right!=null){
        q.add(curr.right);
    }
    }
}


// V 62**************
// flatten binary tree to doubly linked list
static Node prev = null;
static Node head=null;

static void convertToDLL(Node root){
    // we will solve it using inorder traversal
    if(root==null){
        return;
    }

    convertToDLL(root.left);
    if(prev==null){
        head=root;
    }

    else{
        root.left=prev;
        prev.right=root;
    }
    prev=root;
    convertToDLL(root.right);

    
}


  static  class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
          left=right=null;
        }
    
}
}
