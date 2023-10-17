import javax.naming.LinkException;

class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
}

public class linkedlistcyclenode06 {
    public static void main(String[] args) {
        
    }
    public int Cyclelength(ListNode head){
        ListNode fast = head; // fast will start from head
        ListNode slow = head; // slow will start from head

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                //calculate the length  
                ListNode temp = slow;
                int length =0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int length=0;

        ListNode fast = head; // fast will start from head
        ListNode slow = head; // slow will start from head

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = Cyclelength(slow);
                break;
            }
    }

    if(length==0){
        return null;
    }
    
    // find the start node
    ListNode f = head;
    ListNode s = head;

    while(length>0){
        s=s.next;
        length--;
    }

    //keep moving both forward and they will meet at cycle start node
    while(f!=s){
        f=f.next;
        s=s.next;
    }
    return s;
}
}
