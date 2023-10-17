import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];


        // int[][] arr ={
        //     {1,2,3,},//0th index
        //     {4,5,6},//1st index
        //     {7,8,9}//2nd index 
        // };

        int[][] arr2D = {
            {1,2,3,},
            {4,5},
            {6,7,8,9}
        };

        //input
        System.out.println("Enter the elements of array");
        for(int row=0;row<arr2D.length;row++){
            //for each coloumn in every row
            for(int col=0;col<arr2D[row].length;col++){
                arr2D[row][col]=sc.nextInt();
            }

        }

        // //output
        // for(int row=0;row<arr2D.length;row++){
        //     for(int col=0;col<arr2D[row].length;col++){
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        //ouput m-2
        // for(int row=0;row<arr2D.length;row++){
        //     System.out.println(Arrays.toString(arr2D[row]));
        // }

        //output m-3        
        for(int[] a:arr2D ){
            System.out.println(Arrays.toString(a));
        }
    }
}
