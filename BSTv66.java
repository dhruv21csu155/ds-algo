import javax.xml.crypto.NodeSetData;

public class BSTv66 {
    public static void main(String[] args) {
        
    }    

    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    boolean search(Node root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.data>x){
            return search(root.left, x);
        }

        return search(root.right, x);
    }
    
    Node insertRecurssive(Node root,int key){
        if(root==null){
            return new Node(key);
        }

        if(root.data>key){
            root.left=insertRecurssive(root.left, key);
        }else if(root.data<key){
            root.right=insertRecurssive(root.right, key);
        }

        return root;
    }


Node insertIterative(Node root,int key){
        Node newnode = new Node(key);
        Node cur = root;
        Node parent =null;

        while(cur!=null){
            parent = cur;
            if(key<cur.data){
                cur=cur.left;
            }else{
                cur=cur.left;
            }
        }

        if(parent==null){
            parent=newnode;
        }
        else if(key<parent.data){
            parent.left=newnode;
        }else{
            parent.right=newnode;
        }

        return root;
    }

// deletd a node from bst
    public static Node deleteNode(Node root,int key){
        if(root==null){
            return root;
        }

        if(key<root.data){
            root.left=deleteNode(root.left, key);
        }
        else if(key>root.data){
            root.right=deleteNode(root.right, key);
        }


        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            
            root.data=minValue(root.right);

            root.right=deleteNode(root.right, root.data);
        }

        return root;
    }

    static int minValue(Node root){
        int minv=root.data;
        while(root.left!=null){
            minv = root.left.data;
            root = root.left;
        }

        return minv;
    }

    // check whether tree is bst or not
    // m-1  //range method
    static boolean isBST(Node root){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

     static boolean isBSTUtil(Node node, int min, int max) {
        if(node==null){
            return true;
         }

        if(node.data<min || node.data>max){
            return false;
        }

        return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
    }

    // m-2
    static Node prev = null;
    boolean iSBST(Node node){
        if(node!= null){
            if(!iSBST(node.left)){
                return false;
            }

            if(prev!=null && node.data<=prev.data ){
                return false;
            }                                                                                                                                                  

            prev=node;

            return iSBST(node.right);
        }
        return true;
    }

    // v70
    // floor of binary search tree-
    static int floor(Node root ,int key){
        int ans = Integer.MAX_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                root = root.left;
            }
            else{
                ans = root.data;
                root = root.right;
        }

    }
    return ans;
}

static int ceil(Node root,int key){
    int ans = Integer.MIN_VALUE;
    while(root!=null){
        if(root.data==key){
            return root.data;
            
        }

        if(root.data<key){
            root=root.right;
        }else{
            ans = root.data;
            root=root.left;
        }
    }
    return ans;
}
}
