public class cvgcvgvcgj {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int sum =0;
        int sum2 =0;
        for(int i=0;i<nums.length;i=i+2){
            System.out.println(i);
            sum = sum +nums[i]; 
                
            if(i>nums.length-2){
                continue;
            }
              else if(nums[i+2]<nums[i+3]){
                    i=i+1;
                }
        }
        
           for(int i=1;i<nums.length;i=i+2){
            System.out.println(i);
            sum2 = sum2 +nums[i];
               
               if(i>nums.length-2){
                continue;
            }
                else if(nums[i+2]<nums[i+3]){
                    i=i+1;
                }
        }
        
            System.out.println("sum is:"+sum);
       
            System.out.println("sum2:"+sum2);
        
        // return sum2;
    }
}
