public class linkedlistdoubblly {
    private Node head;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
        
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head; 
        node.next=null;
        if(head==null){
            node.prev=null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }

        last.next=node;
        node.prev=last;
        size++;
    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int value,int after){
         Node p = find(after);

         if(p==null){
            System.out.println("Doesn't exist");
         }

         Node node = new Node(value);
         node.next=p.next;
         p.next=node;
         node.prev=p;
         if(node.next!=null){
         node.next.prev=node;
         }
         size++;
    }

    // public int deleteFirst(){
    //     int res=head.value;
    //     head=head.next;
    //     head.prev=null;
    //     // size--;
    //     return res;
         
    // }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        head.next.prev=null;
       
        return val;
     }

     public int deleteLast(){
        Node last=head;

        while(last.next!=null){    //for finding the tail of linked list
            last=last.next;
        }
         if(size<=1){
             deletefirst();
         }
         int val = last.value;
         last = last.prev;
         last.next=null;
         return val;

     }

     public int delete(int index){
        if(index==0){
            return deletefirst();
        }

        if(index==size-1){
            return deleteLast();
        }

       Node temp =head;
       for(int i=0;i<index;i++){
           temp = temp.next;
       }

     int val = temp.next.value;
     temp.next.next.prev=temp;
     temp.next=temp.next.next;
     return val;


     }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp =temp.next;
        }
    }
    
    private class Node{
        int value;
        Node next;
        Node prev;
        
        public Node(int value){
            this.value=value;
        }
    
        public Node(int value,Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    
     }
}
