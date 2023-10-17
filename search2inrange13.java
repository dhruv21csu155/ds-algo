public class search2inrange13 {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        //search for 3 in  the range of index [1,4],

        int target=18;
        System.out.println(LinearSearch(arr, target, 1, 4));

    }
    
      static int LinearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
      }
}
