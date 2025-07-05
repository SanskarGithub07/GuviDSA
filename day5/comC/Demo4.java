package day5.comC;

public class Demo4 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Array before sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(data);

        System.out.println("Array after sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
