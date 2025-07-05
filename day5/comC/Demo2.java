package day5.comC;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int counter = 5;

        for(int i = 0 ; i < 5 ; i++) {
            arr[i] = counter;
            counter--;
        }

        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
