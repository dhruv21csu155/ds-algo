import java.util.Queue;

public class QueuesQ2v51 {
    public static void main(String[] args) {
        // Anuj bhaiya
        // implement stack using queues

    }

    class MyStack{
        Queue q1;
        Queue q2;
         
        void push(int data){
            while(!q1.isEmpty()){
                q2.offer(q1.poll());
            }
            q1.offer(data);

            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }

        }
            int pop(){
                return (int) q1.poll();
            }
    }
}
