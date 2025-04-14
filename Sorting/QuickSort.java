public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void Quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            Quicksort(arr, low, pi - 1);
            Quicksort(arr, pi + 1, high);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 2, 4, 5, 4 };
        Quicksort(arr, 0, 6);
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
}
