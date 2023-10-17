public class BinarySearchInfinitearray{
    public static void main(String[] args) {

    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr,int target){
        //first find the the range
        //first staret with a box of size 2
        int start =0;
        int end =1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end +1;
            //double the box value
            //end= previous end + sizeOfBox*2
            end = end + (end-start+1)*2;
            start=newStart;

        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr,int target,int start,int end){
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
        return -1;
    }
}