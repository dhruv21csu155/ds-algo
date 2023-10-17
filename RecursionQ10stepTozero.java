public class RecursionQ10stepTozero {
    public static void main(String[] args) {
        int num=8;
        System.out.println(steps(num));
    }
    static int steps(int n){
        return helper(n,0);
    }
    static int helper(int num, int steps) {
        if(num==0){
            return steps;
        }

        if(num%2==0){
            return helper(num/2,steps+1);
        }else{
            return helper(num-1, steps+1);
        }
    }
}
