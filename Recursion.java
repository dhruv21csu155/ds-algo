public class Recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again ,you can treat it as a seperate call
        //in the stack


        //tail recursion
        //this is the last function call  
        print(n+1);
    }
}
