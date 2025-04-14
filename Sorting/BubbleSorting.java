
public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 4, 5, 6, 6, 7, 5, 4, 3, 3, 5, 5, 6, 7, 4, 3, 3, 2, 2, 1 };
        // bubble sorting start
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;       }

            }

        }
        printarr(arr);

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
}