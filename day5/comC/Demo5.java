package day5.comC;

public class Demo5 {

    // Main function to perform Merge Sort
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty
        }
        int[] temp = new int[arr.length]; // Auxiliary array for merging
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    // Recursive helper function for Merge Sort
    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Calculate middle index
            mergeSort(arr, temp, left, mid); // Sort left half
            mergeSort(arr, temp, mid + 1, right); // Sort right half
            merge(arr, temp, left, mid, right); // Merge the sorted halves
        }
    }

    // Function to merge two sorted sub-arrays
    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copy elements to the temporary array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left; // Pointer for the left sub-array
        int j = mid + 1; // Pointer for the right sub-array
        int k = left; // Pointer for the merged array

        // Merge the two sub-arrays back into the original array
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of the left sub-array (if any)
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        // Copy remaining elements of the right sub-array (if any)
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        Demo5 sorter = new Demo5();
        sorter.sort(data);

        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
