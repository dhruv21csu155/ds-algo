import java.util.Arrays;

public class bubblesort { // time complexity-O(N^2 worst case)......(space complexity O(N) .
    // also known as inplace sorting algorithhms

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step,max item wil come at the last respective index.
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller tha the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i,it means the array is sorted
            // hence stop the programe.
            if (!swapped) {
                break;
            }
        }
    }
}
