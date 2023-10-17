import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cyclicsortAllduplicates {
    public static void main(String[] args) {
        //****************************** */
        //when given numbers from range 1,N....just use cyclic sort
        // 
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter array elements");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }


        // int [] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(findDuplicates(nums));
    }

    static  List<Integer> findDuplicates(int[] nums){
        List<Integer> ans = new ArrayList<>();
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

    for(int j=0;j<nums.length;j++){ 
        if(nums[j]!=j+1){
         ans.add(nums[j]);
        }
    }

    return ans;

    //or //this is not running why?...its similar to previous q ....find duplicates in an array.
    // int i=0;
    // while(i<nums.length){
    //     if(nums[i]!=i+1){
    //         int correct =nums[i]-1;
    //         if(nums[i]!=nums[correct]){
    //             swap(nums,i,correct);
    //         }else{
    //              ans.add(nums[i]);
    //         }
    //     }else{
    //         i++;
    //     }
    // }
    // return ans;
    
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
