public class Main {
    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int temp[] = new int[arr.length];
        int index = 0;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }
        // printArr(temp);
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
        // printArr(arr);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 5, 25, 9, 65, 2 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}