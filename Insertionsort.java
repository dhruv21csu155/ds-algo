import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter array elements->");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // int [] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--)
            if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }
            else{
                break;
            }

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
