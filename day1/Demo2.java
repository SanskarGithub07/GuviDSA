package day1;

public class Demo2 {

    public static void main(String[] args) {
        String name1 = "Sanskar";
        String name2 = "Sanskar";
        String name3 = new String("Sanskar");
        String name4 = new String("Sanskar"); // new allocates the different memory space
        String name5 = ("Sanskar");

        System.out.println(name5 == name1);
        System.out.println(name1 == name2); // == checks for the reference
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);

        System.out.println(name3.equals(name4)); // .equals checks only the content and not the object reference;

        // MCQ or Interview Question
        // Difference between == and .equals method in java
        // The == checks for the equality in the reference of the object but the .equals method checks for equality in the content/value th object contains.
    }
}
