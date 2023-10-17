import java.util.Arrays;

public class cyclicsortDuplicatenumbers {
    public static void main(String[] args) {

        //amazon interview q
         //****************************** */
        //when given numbers from range 1,N....just use cyclic sort
        // int [] arr={9,6,4,2,3,5,7,0,1};
        int [] nums = {1,3,4,2,2};
        DuplicateNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(DuplicateNumber(nums));

    }

    static int DuplicateNumber(int[] nums){
        int i=0;
    //     while(i<nums.length){
    //         int correct = nums[i]-1;
    //         if(nums[i]!=nums[correct]){
    //         swap(nums,i,correct);
    //      }
    //     else{ 
    //         i++;
    //     }
    // }


    // for(int j=0;j<nums.length;j++){
    //     if(nums[j]!=j+1){
    //         return nums[j];
    //     }
    // }
    // return -1;



    //or//kunal kushwaha

    while(i<nums.length){
        if(nums[i]!=i+1){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                return nums[i];
            }
        }else{
            i++;
        }
    }
    return -1;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
