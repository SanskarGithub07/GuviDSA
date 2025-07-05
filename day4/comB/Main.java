package day4.comB;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry : entryList){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}