public class QueuesUsingArrays {
    public static void main(String[] args) {

    }

    class Queue {
        int a[];
        int capacity;
        int rear;

        public Queue(int n) {
            capacity = n;
            a = new int[n];
            rear = -1;
        }

        int dequeue() throws Exception { // time complexity for deque is O(n) and enqueue is O(1).....so we will do some changes by using
                                         // circular narrays concept and make time = O(1)
            if (rear == -1) {// empty
                throw new Exception();
            }
            int result = a[0];
            for (int i = 0; i < rear; i++) {
                a[i] = a[i + 1];
            }
            rear--;
            return result;
        }

        int getfront() throws Exception {
            if (rear == -1) {
                throw new Exception();
            }

            return a[0];
        }
 
        void enqueue(int data) throws Exception { // time complexity for enqueue is O(1)
            if (rear == capacity - 1) { // overflow
                throw new Exception();
            }

            rear++;
            a[rear] = data;
        }
    }

}
