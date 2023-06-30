import java.util.ArrayList;
import java.util.Scanner;

public class OnlyOneSequenceWithSum {
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
    public static boolean findSubsequenceWithSum(int[] arr, ArrayList<Integer> res, int k, int pos){
        
        if(pos >= arr.length){
            if(sum(res) == k){
                displayArray(res);
                return true;
            }
            return false;
        }
        res.add(arr[pos]);
        if(findSubsequenceWithSum(arr, res, k, pos + 1)){
            return true;
        }
        res.remove(res.size() - 1);
        if(findSubsequenceWithSum(arr, res, k, pos + 1)){
            return true;
        }
        return false;
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
