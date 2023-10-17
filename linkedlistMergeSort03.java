public class linkedlistMergeSort03{
public static void main(String[] args) {
        
public static LinkedListCustom02 merge(LinkedListCustom02 first,LinkedListCustom02 second){
    Node f = first.head;
    Node s = second.head;

    LinkedListCustom02 ans = new LinkedListCustom02();
    while(f!=null && s!=null){
        if(f.value<s.value){
            ans.insertLast(f.value);
            f=f.next;
        }else{
            ans.insertLast(s.value);
            s=s.next;
        }
    }

    while(f!=null){
        ans.insertLast(f.value);
        
    }

    while(s!=null){
        ans.insertLast(s.value);
        s=s.next;
    }

    return ans;
}
    }

}