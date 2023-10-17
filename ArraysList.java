import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         //syntax
        ArrayList<Integer> list = new ArrayList<>();
//          list.add(67);
//          list.add(657);
//          list.add(617);
//          list.add(869); 

// System.out.println(list.contains(654));
// list.set(0,99);
// list.remove(2);

//          System.out.println(list);

//input
System.out.println("Enters the elements in arraylist");
for(int i=0;i<5;i++){
    list.add(sc.nextInt());
}



for(int i=0;i<5;i++){
    System.out.print(list.get(i)+" ");
} //or

// System.out.println(list);

    }
}
