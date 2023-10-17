import java.util.Arrays;

import javax.security.auth.kerberos.KerberosCredMessage;
public class arrayindnumer {
    public static void main(String[] args) {
        int[] nums ={6,5,5};
        
            int max=0;
           int  index=-1;
            for(int i=0;i<nums.length;i++){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                    if(count>max){
                        index=i;
                    }
                }
                
                System.out.println(nums[index]);
            
    }

}
