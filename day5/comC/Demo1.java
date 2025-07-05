package day5.comC;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int counter = 5;

        for(int i = 0 ; i < 5 ; i++) {
            arr[i] = counter;
            counter--;
        }

        // 5 4 3 2 1
        // 4 5 3 2 1
        // 4 3 5 2 1
        // 4 3 2 5 1
        // 4 3 2 1 5 // end of first pass
        // 3 4 2 1 5
        // 3 2 4 1 5
        // 3 2 1 4 5 // end of second pass
        // 2 3 1 4 5
        // 2 1 3 4 5 // end of third pass
        // 1 2 3 4 5 // end of fourth pass
        // n = 5, n - 1 passes completed
                // final array after sorting: 1 2 3 4 5

        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            boolean swapped = true;
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = false;
                }
            }

            if(!swapped){
                break;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
}
