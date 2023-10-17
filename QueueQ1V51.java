import java.util.Stack;

public class QueueQ1V51 {
    public static void main(String[] args) {
        // anuj bhaiya
        // q1 implement queue using stacks
    }

    class MyQueue{
        Stack s1;
        Stack s2;

        void push(int data){
            s1.push(data);  //O(1)
        }

        int pop(){
            while(!s1.empty()){
                s2.push(s1.pop());   //O(N) 
            }

            int ans=(int) s2.pop();
            while(!s2.empty()){
                s1.push(s2.pop());
            }
            return ans;
        }
    }
}
