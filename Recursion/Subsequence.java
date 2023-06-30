import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void displayArray(ArrayList<Integer> res){
        for(int i : res){
            System.out.print(i + " | ");
        }
        System.out.println();
    }
    public static void sub(int[] arr, int pos, ArrayList<Integer> res){
        if(pos >= arr.length){
            displayArray(res);
            return;
        }
        res.add(arr[pos]);
        sub(arr, pos + 1, res);
        res.remove(res.size() - 1);
        sub(arr, pos + 1, res);
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println();
        ArrayList<Integer> res = new ArrayList<>();
        sub(arr, 0, res);
        scan.close();
    }
}
