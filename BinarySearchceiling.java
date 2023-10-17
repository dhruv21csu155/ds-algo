public class BinarySearchceiling {
    public static void main(String[] args) {
        // ceiling=smallest number greator or equal to target number
        int [] arr={2,3,5,9,14,16,18};
        // int [] arr={2,3,5,9,14,16,18};
        // int target =29;
        int target = 22 ;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    //return the  index
    static int ceiling(int[] arr,int target){

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
 
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            // int mid=(start+end)/2; //might be possible that (start+end) exceed the range of int in java
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }else{
                //ans found
                return mid;
               
            }
        }
        return start;
    }
}
 
