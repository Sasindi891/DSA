import java.util.Random;

public class OptimizedQuickSort {

    static Random rand = new Random();

    static int partition(int[] arr, int low, int high) {
        int randomIndex = low + rand.nextInt(high - low + 1);
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[high];
        arr[high] = temp;

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 9, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int x : arr) System.out.print(x + " ");
    }
}
