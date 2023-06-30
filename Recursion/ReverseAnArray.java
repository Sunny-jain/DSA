import java.util.Scanner;

public class ReverseAnArray {
    public static void swap(int []arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void reverse(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        swap(arr, l, r);
        reverse(arr, l + 1,  r - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        reverse(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " | ");
        }
        scan.close();
    }
}