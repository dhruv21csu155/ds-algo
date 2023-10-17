
import java.io.*;
 
class GFG
{
   
  // Function to calculate the maximum stolen value
  static int maxLoot(int hval[], int n)
  {
     
    // base case
    if (n < 0) {
      return 0;
    }
 
    if (n == 0) {
      return hval[0];
    }
     
    // if current element is pick then previous cannot
    // be picked
    int pick = hval[n] + maxLoot(hval, n - 2);
     
    // if current element is not picked then previous
    // element is picked
    int notPick = maxLoot(hval, n - 1);
 
    // return max of picked and not picked
    return Math.max(pick, notPick);
  }
 
  // driver program
  public static void main(String[] args)
  {
    int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
    int n = hval.length;
    System.out.println("Maximum loot value : "
                       + maxLoot(hval, n-1));
  }
}