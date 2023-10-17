import java.lang.annotation.Target;
import java.util.Arrays;

public class search3in2darray13 {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };

        int target=34;
        System.out.println(Arrays.toString(search(arr,target)));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        // return null;//or
        return new int[] {-1,-1};
    }


    static int max (int[][] arr){
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }

        // or
        // for(int[] ints:arr){
        //     for(int element:ints){
        //         if(element>max){
        //             max=element;
        //         }
        //     }
        // }
        return max;
    }
}
