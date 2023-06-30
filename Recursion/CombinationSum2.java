import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum2 {
    public static void sol(int []arr, int pos, int sum, ArrayList<Integer> res){
        if(sum == 0){
            displayArray(res);
            return;
        }
        for(int i = pos; i < arr.length; i++){
            if(i > pos && arr[i] == arr[i - 1])continue;
            if(arr[i] > sum) break;
            res.add(arr[i]);
            sol(arr, i + 1, sum - arr[i], res);
            res.remove(res.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        sol(arr, 0, s, new ArrayList<>());
        scan.close();
    }
    public static void displayArray(ArrayList<Integer> res) {
        for (int i : res) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }
}
