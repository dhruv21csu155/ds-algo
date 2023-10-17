public class RecursionQ8palimdrome {
    public static void main(String[] args) {
        int n =100001;
        System.out.println(palindrome(n));

    }

    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);

    }

   private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }

        int rem =n%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return n==rev(n);
    }
}
