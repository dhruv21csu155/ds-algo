public class linkedlistHappyNo07 {

    public static void main(String[] args) {

        // https://leetcode.com/problems/happy-number/

    }

    public boolean happy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSqaure(slow);
            fast = findSqaure(findSqaure(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;

    }

    private int findSqaure(int number) {
        int ans = 0;
        while (number > 0) {
            int remo = number % 10;
            ans = ans + remo * remo;
            number = number / 10;
        }

        return ans;
    }
}
