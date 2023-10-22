public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println("Unsorted Array:");
        printArray(arr);

        cyclicSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void cyclicSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1) {
                int correctPosition = arr[i] - 1;
                swap(arr, i, correctPosition);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
