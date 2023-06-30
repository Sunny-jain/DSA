public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{ 4, 1, 5, 25, 9, 65, 2 };
        arr = selectionSort(arr);
        printArr(arr);
    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int pos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(min >= arr[j]){
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
