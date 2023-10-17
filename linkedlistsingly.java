public class linkedlistsingly {
    
    private Node head;
    private Node tail;
    private int size;
    
    public linkedlistsingly() {
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value); 

        if(tail==null){
            tail=head;
        }
        node.next=head;
        head=node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        
        Node last=head;
        while(last.next!=null){
            last = last.next;
        }
        System.out.println(last);

        if(last==null){
            insertFirst(value);
            return;
        }

        last.next=node;
        last=node;
        size++;
        
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size-1){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next=node;
        size++;
    }


    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int res=head.value; 
        head= head.next;
        size--;
        return res;
    }

    public int deleteLast(){
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        Node secondlast =get(size-2);
        int res = last.value;
        last=secondlast;
        secondlast.next=null;
        size--;
        return res;
        
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size-1){
            return deleteFirst();
        }

        Node prev = get(index-1);
        int res=prev.next.value;
        prev.next=prev.next.next;
        return res;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
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
