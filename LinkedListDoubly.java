import org.w3c.dom.NodeList;

public class LinkedListDoubly {
    private Node head;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev= null;

        if(head!=null){
          head.prev=node;
        }

        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node =new Node(val);
        Node last = head;   

        node.next=null;

        if(head==null){
            node.prev=null;
            head = node;
            return;
        }  

        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev= last;
        size++;

    }
    
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.val == value){
                return node;
            }

            node = node.next;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
        node.next.prev=node;
        }

        size++;
    }

   

    public int deletefirst(){
        int val = head.val;
        head = head.next;
        head.next.prev=null;
       
        return val;

// acoording to dhruv at 3 dcember 2022
        // int val = head.val;
        // head = head.next;
        // head.prev=null;
       
        // return val;
     }
 
     public int deletelast(){
        Node last=head;

        while(last.next!=null){    //for finding the tail of linked list
            last=last.next;
        }
         if(size<=1){
             deletefirst();
         }
        //  Node secondlast = get(size-2);
        //  int val= last.val;
        //  last=secondlast;
        //  last.next=null;
        //  return val;  


        // or
        int val =last.val;
            last=last.prev;
        last.next=null;
        return val;
        
      }
 
      public int delete(int index){
         if(index==0){
             return deletefirst();
         }
 
         if(index==size-1){
             return deletelast();
         }
 
        //  Node prev = get(index-1);
        //  int val=prev.next.val;
 
        //  prev.next=prev.next.next;
 
        //  return  val;
        Node temp =head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }

        int val=temp.next.val;

        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        return val;

        
      }

    //  public Node get(int index){
    //      Node node = head;
    //      for(int i=0;i<index;i++){
    //          node= node.next;
    //      }
    //      return node;    
    //  }
 
    public void dispay(){
        Node node = head;
        Node last = null;
         while(node!=null){
           System.out.print(node.val+" -> ");
           last=node; 
           node = node.next;
         }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void displayRev(){
        
    }
 private class Node{
    int val;
    Node next;
    Node prev;
    
    public Node(int val){
        this.val=val;
    }

    public Node(int val, LinkedListDoubly.Node next, LinkedListDoubly.Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

 }
}
