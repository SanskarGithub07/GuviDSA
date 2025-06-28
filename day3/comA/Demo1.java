package day3.comA;

//Single Inheritance
// Multilevel inheritance
//Hierarchical Inheritance
// Multiple Inheritance
// Hybrid Inheritance

//When you create a child object the parent constructor always gets called first (no args)
// before the child default constructor
//System.exit(0) to break out of forever loops.
//Do while loops same as CPP

// In the below code if you try to display the details without setting the
// values of the attributes then it will give a NullPointer exception

import java.util.Scanner;
class Emp
{
    int uid;
    String name;
    int age ;
    int salary ;
    String desig;
    Scanner sc = new Scanner(System.in);
    Emp(){
        System.out.println("Enter ID :"); uid=sc.nextInt();
        System.out.println("Enter Name :"); name=sc.next();
        System.out.println("Enter Age :"); age=sc.nextInt();
//		System.out.println("Enter Salary:"); uid=sc.nextInt();
//		System.out.println("Enter Desig :"); desig=sc.next();
    }
    void display()
    {
        System.out.println("ID :"+uid);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
    }
    void raiseSalary() {
        salary=salary+ 2500;
        System.out.println("Salary Raised...!");
    }
}
class Clerk  extends Emp
{
    public Clerk() {
        salary=25000;
        desig="Clerk";
    }
}
class Developer  extends Emp
{
    public Developer() {
        salary=50000;
        desig="Developer";
    }
}
class Tester  extends Emp
{
    public Tester() {
        salary=40000;
        desig="Tester";
    }
}
class Manager  extends Emp
{
    public Manager() {
        salary=90000;
        desig="Manager";
    }
}
public class Demo1 {

    public static void main(String[] args) {
//		Clerk c = new Clerk();c.display();
//		System.out.println("=============Developer========");
//		Developer d = new Developer();d.display();
//		System.out.println("=============Tester========");
//		Tester t = new Tester();t.display();
//		System.out.println("=============Manager========");
//		Manager m = new Manager();m.display();
        Scanner sc = new Scanner(System.in);
        int ch1, ch2, ch3, ch4 = 0;
        Manager m = null;
        Clerk c = null;
        Developer d = null;
        Tester t = null;
        do {
            System.out.println("1 ) Create ");
            System.out.println("2 ) Display");
            System.out.println("3 ) Raise Salary ");
            System.out.println("4 ) Exit ");
            ch1 = sc.nextInt();
            if (ch1 == 1) {
                do {
                    System.out.println("	1 ) Manager ");
                    System.out.println("	2 ) Developer");
                    System.out.println("	3 ) Tester ");
                    System.out.println("	4 ) CLerk");
                    System.out.println("	5 ) Exit");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m = new Manager();
                    }
                    if (ch2 == 2) {
                        d = new Developer();
                    }
                    if (ch2 == 3) {
                        t = new Tester();
                    }
                    if (ch2 == 4) {
                        c = new Clerk();
                    }
                } while (ch2 != 5);
            }
            if (ch1 == 2) {

                do {
                    System.out.println("	1 ) Manager ");
                    System.out.println("	2 ) Developer");
                    System.out.println("	3 ) Tester ");
                    System.out.println("	4 ) CLerk");
                    System.out.println("	5 ) Exit");
                    ch3 = sc.nextInt();
                    if (ch3 == 1) {
                        m.display();
                    }
                    if (ch3 == 2) {
                        d.display();
                    }
                    if (ch3 == 3) {
                        t.display();
                    }
                    if (ch3 == 4) {
                        c.display();
                    }
                } while (ch3 != 5);

            }
            if (ch1 == 3) {
                do {
                    System.out.println("	1 ) Manager ");
                    System.out.println("	2 ) Developer");
                    System.out.println("	3 ) Tester ");
                    System.out.println("	4 ) CLerk");
                    System.out.println("	5 ) Exit");
                    ch4 = sc.nextInt();
                    if (ch4 == 1) {
                        m.raiseSalary();
                    }
                    if (ch4 == 2) {
                        d.raiseSalary();
                    }
                    if (ch4 == 3) {
                        t.raiseSalary();
                    }
                    if (ch4 == 4) {
                        c.raiseSalary();
                    }
                } while (ch4 != 5);
            }
            if (ch1 == 4) {
                System.out.println("Thank you...!");
                System.exit(0);
            }
        } while (ch1 != 5);
    }
}
