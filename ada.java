public class ada {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,5,5,9,9,7,7,7,7,5,6,12,12,44,65};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]>max){
                    max=arr[i];
                }
            }
        }
        return max;

    }
    static int min(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]<min){
                    min=arr[i];
                }
            }
        }
        return min;

    }
}
