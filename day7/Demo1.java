package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        List<Integer> list = new ArrayList<>();

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        System.out.println(al);
        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        al.removeFirst();
        al.removeLast();
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.contains(100));
        al.add(2, 250);

        ArrayList al2 = new ArrayList<>();
        al2.addAll(al);
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        al.remove(2);
        System.out.println(al);
    }
}
