public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int target) {

        int s=0;
        int e = arr.length-1;

        while(s<=e){
            int mid=(e-s)/2+s;

            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}