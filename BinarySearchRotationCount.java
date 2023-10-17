public class BinarySearchRotationCount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        // int[] arr={1,2,3,4,5,6};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr){
        int pivot =pivot(arr);
        return pivot+1;

    }
    //use this for non-duplicates value
    static int pivot(int[] arr){
        int start=0;
        int end =arr.length-1;

        int mid= start+(end-start)/2;
        //4 cases
        if(arr[mid]>arr[mid+1]){
            return mid;
        }
        if(arr[mid]<arr[mid-1]){
            return mid-1;
        }

        if(arr[mid]<arr[start]){
            end=mid-1;
        }else{
            start=mid+1;
        }
        return -1;
    } 
}
