public class Permutation {
    public static void swap(int []arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static void sol(int[] arr, int index){
        if(index >= arr.length){
            printArr(arr);
        }
        for(int i = index; i < arr.length; i++){
            swap(arr, index, i);
            sol(arr, index + 1);
            swap(arr, index, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        sol(arr, 0);
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}