import java.util.ArrayList;

public class Elimination {
    // See https://leetcode.com/problems/elimination-game/
    // Direction: Solve it using an ArrayList
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++) {
            arr.add(i);
        }
        System.out.println("Initial List: " + arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Removed: " + arr.get(i));
                arr.remove(i);
            }
        }

    }
}
