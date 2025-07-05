package day4.comB;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //Reverse the array
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        for(int i = 0 ; i < arr.length / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //Copy the array into another array

        int[] arr_copy = new int[arr.length];
        for(int i = 0 ; i < arr_copy.length ; i++){
            arr_copy[i] = arr[i];
        }

        for(int i = 0 ; i < arr_copy.length ; i++) {
            System.out.print(arr_copy[i] + " ");
        }

        System.out.println("");

        //Take average of all elements in the array

        double average = 0;
        for(int i = 0 ; i < arr.length ; i++){
            average += arr[i];
        }

        average /= arr.length;
        System.out.println(average);

        //Search for an element in the array

        int target = 4;
        boolean found = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                found = true;
                System.out.println("Target " + target + " found at index " + i);
                break;
            }
        }

        if(!found){
            System.out.println("Target not present in the array");
        }

        //Sort the array

        Arrays.sort(arr);

        System.out.println("Printing sorted array");
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
