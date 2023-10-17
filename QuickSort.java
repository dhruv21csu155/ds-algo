import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        // int[] arr={5,4,3,2,1};
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter array elements->");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        
        // also a reason why if its already sorted it will not swap
        while(e<=s){
            while(arr[s]<pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }

            if(e<=s){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;

            }
        }

        // now  my pivot is at correct index,please sort two halves now
        quickSort(arr, low, e);  //see video we confusion in taking range as low,e
        quickSort(arr, s, high);
    }
}
