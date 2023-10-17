import java.util.List;

public class linkedlistReorderlistQ14 {
    public static void main(String[] args) {
// google ,facebook
    }

private ListNode head;
        public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next;
        }

        return s;
    }

 private ListNode reverseIterativemethod2(ListNode  head){
        // if(size<2){
        //     return;
        // }

    if(head==null){
        return head;
    }

        ListNode prev =null;
        ListNode present=head;
        ListNode next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
            next=next.next;
            }
        }

        return prev;

    }

    public void reorderList(ListNode head){
      if(head==null || head.next==null){
        return;
      }

      ListNode mid = middleNode(head);

      ListNode hs = reverseIterativemethod2(mid);
      ListNode hf = head;

    //   rearrange
    while(hf!=null && hs!=null){
        ListNode temp = hf.next;
        hf.next=hs;
        hf= temp;
        temp= hs.next;
        hs.next=hf;
        hs= temp;
    }

    // next of tail to null
    if(hf!=null){
        hf.next=null;
    }

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
}

