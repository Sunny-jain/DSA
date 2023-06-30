import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {
    public static void sol(int[] arr, int sum, int pos, ArrayList<Integer> res) {
        if (pos >= arr.length) {
            res.add(sum);
            return;
        }
        sol(arr, sum + arr[pos], pos + 1, res);
        sol(arr, sum, pos + 1, res);
    }

    public static void displayArray(ArrayList<Integer> res) {
        for (int i : res) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 2 };
        ArrayList<Integer> res = new ArrayList<>();
        sol(arr, 0, 0, res);
        Collections.sort(res);
        displayArray(res);
    }
}
