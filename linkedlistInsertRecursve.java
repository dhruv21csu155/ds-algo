public class linkedlistInsertRecursve {
    public static void main(String[] args) {
        
    }
    int size;
    Node head;
    public void  insertRec(int val,int index){
        head =insertRecursive(val, index, head);
    }

    public Node insertRecursive(int val,int index,Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

       node.next= insertRecursive(val, index--,node.next);
       return node;
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
        
    }
}
