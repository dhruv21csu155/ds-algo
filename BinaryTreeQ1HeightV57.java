public class BinaryTreeQ1HeightV57 {
    public static void main(String[] args) {
        // anuj bhaiya
    }


    static int height(Node root){
        if(root==null){
            return 0;
    }


    return Math.max(height(root.left),height(root.right))+1;
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
