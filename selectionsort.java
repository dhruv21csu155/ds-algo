import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter array elements");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // int [] arr={3,5,2,8,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the maximum element in the remaning array and swap with correct index.
            int last = arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            System.out.println(arr[maxIndex]);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max =start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;  //this is the index of maximum element in array.
            }
        }
        return max;
    }
}
