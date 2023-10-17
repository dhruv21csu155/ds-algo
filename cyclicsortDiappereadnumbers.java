import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicsortDiappereadnumbers {
    public static void main(String[] args) {

        //google interview q

        //****************************** */
        //when given numbers from range 1,N....just use cyclic sort
        // int [] arr={9,6,4,2,3,5,7,0,1};
        int [] nums = {4,3,2,7,8,2,1};
        findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        // int i=0;
        // while(arr[i]!=i+1){
        //     swap(arr,i,arr[i]-1);
        // }
        // i++;

        //or kunal kushwaha method
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
            swap(nums,i,correct);
         }
        else{
            i++;
        }
    }

    //just find missing numbers
    List<Integer> ans = new ArrayList<>();
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            ans.add(j+1);
        }
    }
    return ans;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
