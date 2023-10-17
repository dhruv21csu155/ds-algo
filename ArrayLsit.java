import java.util.Arrays;

public class ArrayLsit{
    public static void main(String[] args){
        int [] arr = {1,3,23,9,18};
        // System.out.println(MaxVal(arr, 1, 4));
        System.out.println(linearSearch(arr, 23));
        System.out.println(1764/10);
    }


static int MaxVal(int[] arr,int start,int end){
    int maxval=Integer.MIN_VALUE;
    for(int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
}


static int linearSearch(int[]  arr,int target){
    if (arr.length==0){
        return -1;
    }

    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
return -1;
} 
}
