public class RecursionQ1q2 {
    public static void main(String[] args) {
        // q(5);
        //  qrev(5);
        qboth(5);
    }
    static void q(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        q(n-1);
    }



    
    static void qrev(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        qrev(n-1);
        System.out.println(n);
    }



    static void qboth(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        qboth(n-1);
        System.out.println(n);
    }
}
