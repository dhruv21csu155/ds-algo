public class search4evendigits13 {
    public static void main(String[] args) {
        int[] num={-12,12,345,2,6,22,44,7896};
        System.out.println(findNumbers(num));

        System.out.println(digits(4895));
        System.out.println(digits2(45698758));
    }


    static int findNumbers(int[] num){
        int count=0; 
        for(int element:num){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

    //function to fin no. of digits and check whether it is even or not
    // static boolean evendigits(int element){

    //     if(element<0){
    //         element=element*-1;
    //     }

    //     int count=0;

    //     while(element>0){
    //         count++;
    //         element=element/10;
            
    //     }
    //     if(count%2==0){
    //         return true;
    //     }
        
    //     return false;
    // }


    // function to check whether a number contains even numbers of digits or not.
    static boolean even(int element) {
        if(digits(element)%2==0){
            return true;
        }
        return false;
    }

    //function to count number of digits
    static int digits(int element){
        if(element<0){
            element=element*-1;
        }
        
        if(element==0){
            return 1;
        }
        
        int count=0;
        while(element>0){
            count++;
            element=element/10;
            
        }
        
        return count;
    }


    //function to count number of digits
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }

        return (int)(Math.log10(num))+1;
        }
}
