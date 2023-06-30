import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {
    public static void sol(int arr[], int pos, int sum, ArrayList<Integer> res) {
        if (pos > arr.length - 1) {
            if (sum == 0) {
                displayArray(res);
            }
            return;
        }
        if (sum >= arr[pos]) {
            res.add(arr[pos]);
            sol(arr, pos, sum - arr[pos], res);
            res.remove(res.size() - 1);
        }
        sol(arr, pos + 1, sum, res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        sol(arr, 0, s, res);
        scan.close();
    }

    public static void displayArray(ArrayList<Integer> res) {
        for (int i : res) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }
}