import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {

        //****************************** */
        //when given numbers from range 1,N....just use cyclic sort
        // int [] arr={9,6,4,2,3,5,7,0,1};
        int [] nums = {4,3,2,7,8,2,3,1};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic(int[] arr){
        // int i=0;  //this is not correct......why?
        // while(arr[i]!=i+1){
        //     swap(arr,i,arr[i]-1);
        // }
        // i++;

        //or kunal kushwaha method
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
         }
        else{
            i++;
        }
    }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
