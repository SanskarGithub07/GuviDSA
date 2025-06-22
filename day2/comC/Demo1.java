package day2.comC;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the A value: ");
        int num1 = scanner.nextInt(); // 100

        System.out.println("Enter the B value: ");
        int num2 = scanner.nextInt(); // 50

//        int max = 0;
//        if(num1 > num2){
//            max = num1;
//        }
//        else{
//            max = num2;
//        }
//
//        System.out.println("max: " + max);
        System.out.println("Max is: " + Math.max(num1, num2));
        System.out.println("Min is: " + Math.min(num1, num2));
        System.out.println("Pow: " + Math.pow(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.cbrt(num2));
        System.out.println(Math.ceil(num1));
        System.out.println(Math.floor(num1));

        System.out.println("=====================================");

        System.out.println("Enter the base value: ");
        int base = scanner.nextInt();
        System.out.println("Enter the exp value: ");
        int exp = scanner.nextInt();

        int result = 1;
        for(int i = 1 ; i <= exp ; i++){
            result = result * base;
        }

        System.out.println(base +  " ^ " + exp + " = " + result);

    }
}
