import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceWithSum {
    public static int sum(ArrayList<Integer> res){
        int s = 0;
        for(int i : res){
            s += i;
        }
        return s;
    }
    public static void displayArray(ArrayList<Integer> res){
        for(int i : res){
            System.out.print(i + " | ");
        }
        System.out.println();
    }
    public static void findSubsequenceWithSum(int[] arr, ArrayList<Integer> res, int k, int pos){
        
        if(pos >= arr.length){
            if(sum(res) == k){
                displayArray(res);
            }
            return;
        }
        res.add(arr[pos]);
        findSubsequenceWithSum(arr, res, k, pos + 1);
        res.remove(res.size() - 1);
        findSubsequenceWithSum(arr, res, k, pos + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        findSubsequenceWithSum(arr, res, k, 0);
        scan.close();
    }
}
