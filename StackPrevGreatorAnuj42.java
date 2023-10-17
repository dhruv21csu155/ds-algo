import java.util.Stack;

public class StackPrevGreatorAnuj42 {
    public static void main(String[] args) {
        int [] a= {4,10,5,8,20,15,3,12};

    }

    public void nextSmallerElement(int a[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<a.length;i--){
            while(!s.empty() && s.peek()<=a[i]){
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
        }
    }

