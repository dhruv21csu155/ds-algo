public class stacksarray {
    int a[];
    int top;
    int capacity;
    
    public stacksarray(int capacity){
        this.capacity=capacity;
        top=-1;
        a = new int[capacity];

    }

    void push(int data) throws Exception{
        if(top==capacity-1){
         throw new Exception();
        }

        top++;
        a[top]=data;
    }

    int pop() throws Exception{
        if(top==-1){
            throw new Exception();
        }
        int res=a[top];
        top--;
        return res;
    }

    int peek() throws Exception{
        if(top==-1){
            throw new Exception();
        }

         return a[top];
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==capacity-1;
    }

}
