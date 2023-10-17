import javax.swing.plaf.synth.SynthSpinnerUI;

public class LLDoubly05 {
    private Node head;
    private int size;
    
    public void insertFirst(int val){
        Node node = new Node(val);

        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=null;
        }

        head=node;

    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
           last = last.next;
        }

        last.next=node;
        node.prev=last;
        node.next=null;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int after,int val){
     Node p =find(after);

     if(p==null){
        System.out.println("does nopt exist");
        return;
     }
     
     Node node = new Node(val);
     node.next=p.next;
     p.next=node;
     node.prev=p;
     if(node.next!=null){
        node.next.prev=node;
     }

    }

    public int deletefirst(){
       int val = head.value;
       head = head.next;
       head.next.prev=null;
      
       size--; 
       return val;
    }

    // public int deletelast(){
    //     if(size<=1){
    //         deletefirst();
    //     }
    //     Node secondlast = get(size-2);
    //     int val= tail.value;
    //     tail=secondlast;
    //     tail.next=null;
    //     return val;
    //  }

    //  public int delete(int index){
    //     if(index==0){
    //         return deletefirst();
    //     }

    //     if(index==size-1){
    //         return deletelast();
    //     }

    //     Node prev = get(index-1);
    //     int val=prev.next.value;

    //     prev.next=prev.next.next;

    //     return  val;
    //  }
    // public Node get(int index){
    //     Node node = head;
    //     for(int i=0;i<index;i++){
    //         node= node.next;
    //     }
    //     return node;    
    // }

    public void dispay(){
        Node node = head;
        Node last = null;
       while(node!=null){
        System.out.println(node.value + "->");
        last=node;
        node= node.next;
       }
       System.out.println("END");
       System.out.println("Print in reverse");
       while(last!=null){
        System.out.println(node.value+"->");
        last=last.prev;
       }
       System.out.println("START");
    }

    


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}