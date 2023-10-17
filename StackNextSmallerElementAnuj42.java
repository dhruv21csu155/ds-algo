import java.util.Stack;

public class StackNextSmallerElementAnuj42 {
    public static void main(String[] args) {
        int [] a={3,10,5,1,15,10,7,6};
    }

    public void NextSmallerElement(int a[]){
        Stack<Integer> s = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.empty() && s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(s.peek());
            }

            s.push(a[i]);
        }


        int [] arr= new int[a.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.peek();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
