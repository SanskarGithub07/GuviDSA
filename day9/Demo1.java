package day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        //Map interface in java
        // HashMap - no duplicate + random order
        //LinkedHashMap - no duplicate + user entered order
        // TreeMap - duplicate + sorted order

        TreeMap<String, String> map = new TreeMap<>();

        map.put("123", "ABC");
        map.put("423", "ABC");
        map.put("223", "ABC");
        map.put("323", "ABC");
        map.put("1553", "ABC");
        map.put("ABCD", "ABC");
        map.put("XYZ", "ABC");

        Set s = map.entrySet();
        Iterator i = s.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
        return;
    }
}
