import javax.management.MalformedObjectNameException;

import org.w3c.dom.css.CSSRuleList;

public class linkedlistSubReverse {
    public static void main(String[] args) {
        
    }


    public ListNode reverseBetween(ListNode head,int left,int right){
        if(left==right){
            return head;
        }

        // skip the first lwft -1 nodes;
        ListNode current=head;
        ListNode prev=null;
        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;

        }

        ListNode last = prev;
        ListNode  newEnd= current;
        ListNode next = current.next;
        // reverse between left and right
        for(int i=0;current!=null&&i<right-left+1;i++){
            current.next=prev;
            prev=current;
            cu
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
