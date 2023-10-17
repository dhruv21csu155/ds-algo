public class QueuesCircularArray {  //by anuj bhaiya
    public static void main(String[] args) {
        
    }

    class circularArrayQueue{
        int a[];
        int n;
        int front = -1,rear=-1;
        public circularArrayQueue(int n){
            this.n=n;
            a= new int[n];
        }


        
        void enqueue(int data){
            if((rear+1)%n==front){  //condition for checking whether the queue is empty or not
                return;
            }
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%n;
            a[rear]=data;
        }
        
        int dequeue() throws Exception{
            if(front==-1){
                throw new Exception();9
                
            }

            int result=a[front];
            if(front==rear){
                front=rear=-1; 
            }else{
                front=(front+1)%n;
            }
            return result;
        }
    } 
}
