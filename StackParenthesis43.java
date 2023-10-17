import java.util.Stack;

public class StackParenthesis43 {
    public static void main(String[] args) {

        String str ="()([])";
    }
    
    boolean isParenthesisMatching(String str){
        Stack<character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(isOpening(cur)){
                s.push(cur);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(), cur)){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }

        return s.isEmpty();
    }

    boolean isOpening(char c){
        return c='(' || 
                c='{'||
                c="[";  
    }

    boolean isMatching(char a,char b){
        return (a='('&&b=')');
         (a='{'&&b='}' );
         (a='['&&b=']' );
    }
}
