import java.util.Arrays;

public class cyclicsortSetMismatch {
    public static void main(String[] args) {

        // ****************************** */
        // when given numbers from range 1,N....just use cyclic sort
        int [] nums = {1,2,2,4};
        findErrorNums(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        int j;
        for (j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{nums[j],j+1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
