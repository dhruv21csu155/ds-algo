public class RecursiomQ9countzeros {
    public static void main(String[] args) {
         int n=303000092;
         System.out.println(zero(n, 0));
    }
    static int zero(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return zero(n/10, count+1);
        }else{
        return zero(n/10, count);
        }
        }
    
}
