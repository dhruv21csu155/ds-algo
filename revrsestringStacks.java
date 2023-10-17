import java.util.Stack;

public class revrsestringStacks {
    public static void main(String[] args) {
        String s ="data structures and algorithms";
        reverse(s);
    }

    private static void reverse(String s) {
        Stack<String> stc = new Stack<> ();

        String  temp="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                stc.add(temp);

                temp="";
            }
            else{
                temp = temp+s.charAt(i);
            }
        }


        stc.add(temp);//for the last word of the String

        while(!stc.isEmpty()){
            temp=stc.peek();
            System.out.print(temp+" ");
            stc.pop();
        }
        System.out.println();
    }
}
