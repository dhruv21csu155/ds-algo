
public class RecursionArrayQ2{
    public static void main(String[] args) {
       int [] arr={3,2,1,18,18,9}; 
    //    System.out.println(linearTarget1(arr, 18, 0));
    System.out.println(findIndexLast(arr, arr.length-1, 18));
    }

    // m-1 for yea or no
    static boolean linearTarget1(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || linearTarget1(arr, target, index+1);
    }


    //method 2 for finding index
    static int linearTarget2(int[] arr,int index,int target){
        if(index==arr.length){  
            return -1; 
        }

            
    if(arr[index]==target){
        return index;
    }else{

    return linearTarget2(arr, index+1, target);
    }

    }


    // search from last
    static int findIndexLast(int[] arr,int index,int target){
        if(index==-1){
            return -1; 
        }

            
    if(arr[index]==target){
        return index;
    }

    return linearTarget2(arr, index-1, target);

    }


// find all index
static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndez(int[] arr,int index,int target){
        if(index==arr.length){  
            return; 
        }

            
    if(arr[index]==target){
        list.add(index);
    }
    findAllIndez(arr, index+1, target);

    }

}