public class QueueUsingLL {
    public static void main(String[] args) {
        
    }
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    class Queue{
        Node front,rear;
        
        public int dequeue() throws Exception{
             if(front==null){
                 throw new Exception();
             }
             int result=front.data;
             front=front.next;
             return result;
         }
         
        void enque(int data){
            Node node = new Node(data);

            if(front==null){
                front=rear=node;
                return;
            }
            rear.next=node;
            rear=node;
        }
    }


}
