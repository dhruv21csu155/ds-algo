import java.util.Stack;

public class StackPrevSmallerAnuj42 {
    public static void main(String[] args) {
        int [] a={4,10,5,18,3,12,7};

    }

    public void PreviousSmallerElement(int a[]){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<a.length;i++){
            while(!s.empty()&&s.peek()>=a[i]){
                s.pop();
            }

            if(s.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(s.peek());
            }

            s.push(a[i]);
        }
    }

}
