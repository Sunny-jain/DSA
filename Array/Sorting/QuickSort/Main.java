public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 5, 25, 9, 65, 2 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int partitionIndex = partition(arr, l, r);
            quickSort(arr, l, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, r);
        }
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (arr[i] <= pivot && i <= r - 1) {
                i++;
            }
            while (arr[j] >= pivot && j >= l + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
