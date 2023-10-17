public class linkedlistRemveDuplcats02 {
    public static void main(String[] args) {
        linkedlistRemveDuplcats02 list = new linkedlistRemveDuplcats02();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicates();
        list.display();
      
    }

    private Node head;
    private Node tail;
    public int size;

    public void insertFirst(int val){    
        Node node = new Node(val);
        node.next=head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size = size +1;
    }

    public void insertLast(int val){
        if(tail==null){
             insertFirst(val);
             return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail = node;
        size++;
    }


    public void duplicates(){
            Node node = head;
            while(node.next!=null){
                if(node.value==node.next.value){
                    node.next=node.next.next;
                    size--;
                }else{
                    node=node.next;
                }
            }
            tail=node;
            tail.next=null;

    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;

        }
        System.out.println("END");
    }
        

    private class Node{
        private int value;
        private Node next;

        public Node(int value, linkedlistRemveDuplcats02.Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
        
    }
}
