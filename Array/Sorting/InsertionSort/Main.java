public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{ 4, 1, 5, 25, 9, 65, 2 };
        arr = InsertionSort(arr);
        printArr(arr);
    }
    public static int[] InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int val = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > val){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}