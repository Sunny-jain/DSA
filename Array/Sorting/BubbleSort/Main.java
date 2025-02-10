public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{ 4, 1, 5, 25, 9, 65, 2 };
        arr = bubbleSort(arr);
        printArr(arr);
    }
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            System.out.println("pass");
        }
    }
}
