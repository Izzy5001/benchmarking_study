public class quicksort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};  // Example array
        System.out.println("Original Array: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);  // Calling the QuickSort function

        System.out.println("Sorted Array: ");
        printArray(arr);  // Printing the sorted array
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);  // Partition the array
            quickSort(arr, low, pivotIndex - 1);  // Recursively sort the left part
            quickSort(arr, pivotIndex + 1, high);  // Recursively sort the right part
        }
    }

    // Partition function to place the pivot element in its correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the pivot element as the last element
        int i = low - 1;  // Index for the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the pivot index
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}