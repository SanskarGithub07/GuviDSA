package day4;


//Abstraction - abstract classes and interfaces (Hiding the Implementation)

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {

        // Array is a collection of homogeneous elements;
        // Only similar kind of data is allowed
        // Fixed size
        System.out.println("Demo1");
        int arr[] = {1, 2, 4};
        //Nothing is really mandatory in a for loop as the result depends on no condition -> infinite, no increment -> same value, not both -> infinite and same value
        for(int i = 0 ; i < arr.length ; i++){ // Not mandatory to initialize i in the for loop you can also initialize it outside
            System.out.println(arr[i]);
        }

        //For each loop
        for(int element : arr){
            System.out.println(element);
        }

//        int[] new_arr = new int[5];
//
//        new_arr[0] = 100;
//        new_arr[1] = 100;
//        new_arr[2] = 100;
//        new_arr[3] = 100;
//        new_arr[4] = 100;
//        new_arr[5] = 100;
//
//        for(int i = 0 ; i < new_arr.length ; i++){
//            System.out.println(new_arr[i]);
//        }

        // The above code causes a runtime error and not a compile time error as the declared size is 5 and elements inserted is 6
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(3);
        list.add(23.6);

        System.out.println(list);
        //ArrayList - Heterogeneous
        //Size is not fixed

        Iterator i =  list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
