class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class linkedlistcyclelength05 {
    public static void main(String[] args) {
       //fast and slow pointer general method for cycle detection
        // https://leetcode.com/problems/linked-list-cycle/
        // Amazon and Mircosoft
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
}
