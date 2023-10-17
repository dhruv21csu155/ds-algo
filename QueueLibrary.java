// import java.util.LinkedList;
// import java.util.Queue;
import java.util.*;

public class QueueLibrary {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();   // recommenaded way to implement queue
        q.offer(10);
                // corresponding to offer there is function add but it throws exception if someting is wrong

        q.offer(20);
        q.offer(30);
        q.poll();  //element ko bhr nikal dega  
        // corresponding to poll there is function remove but it throws exception if someting is wrong
       
        q.peek();  //elemenet ko bhr nhi nikalega
                // corresponding to peek there is function element but it throws exception if someting is wrong

        q.size();
        q.isEmpty();
    }
}
