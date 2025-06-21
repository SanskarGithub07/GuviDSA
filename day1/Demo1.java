package day1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Java...");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: "); // next() reads string only without space
        String name = scanner.nextLine();
        System.out.println("My name is: " + name);

        System.out.println("Enter id: ");
        Integer id = scanner.nextInt();
        System.out.println("My id is: " + id);

        scanner.nextLine();

        System.out.println("Enter salary: ");
        Double salary = scanner.nextDouble();
        System.out.println("My salary is: " + salary);

        scanner.nextLine();

        System.out.println("Enter designation: ");
        String designation = scanner.nextLine();
        System.out.println("My designation is: " + designation);

        System.out.println("Enter age: ");
        Integer age = scanner.nextInt();
        System.out.println("My age is: " + age);
    }
}
