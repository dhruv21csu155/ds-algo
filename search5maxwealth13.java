public class search5maxwealth13 {
    public static void main(String[] args) {
        
    }
    static int maximumwealth(int[][] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int rowsum=0;
            for(int j=0;j<arr[i].length;j++){
                rowsum = arr[i][j];
            }
            if(rowsum>max){
                max=rowsum;
            }
        }


        return max;

    }
}
