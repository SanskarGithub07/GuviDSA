package day4.comA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Emp
{
    int uid;
    String name; // finxed , we cant chang name ,
    int age ;
    int salary ;
    String desig; // developer ---- > Sr Developer : will chaancge
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
public class Demo2 {

    public static void main(String[] args) {
//		Clerk c = new Clerk();c.display();
//		System.out.println("=============Developer========");
//		Developer d = new Developer();d.display();
//		System.out.println("=============Tester========");
//		Tester t = new Tester();t.display();
//		System.out.println("=============Manager========");
//		Manager m = new Manager();m.display();
        Scanner sc = new Scanner(System.in);
        int ch1,ch2,ch3,ch4=0;
//		Manager m = null;
//		Clerk c = null;
//		Developer d = null;
//		Tester t = null;
        ArrayList<Emp> al = new ArrayList<Emp>();
        do {
            System.out.println("1 ) Create ");
            System.out.println("2 ) Display");
            System.out.println("3 ) Raise Salary ");
            System.out.println("4 ) Exit ");
            ch1=sc.nextInt();
            if(ch1==1) {
                do {
                    System.out.println("	1 ) Manager ");
                    System.out.println("	2 ) Developer");
                    System.out.println("	3 ) Tester ");
                    System.out.println("	4 ) CLerk");
                    System.out.println("	5 ) Exit");
                    ch2=sc.nextInt();
                    if(ch2==1) {
                        al.add(new Manager());
                    }
                    if(ch2==2) {
                        al.add(new Developer());
                    }
                    if(ch2==3) {
                        al.add(new Tester());
                    }
                    if(ch2==4) {
                        al.add(new Clerk());
                    }
                }while(ch2!=5);
            }
            if(ch1==2) {

                Iterator i=al.iterator();
                while(i.hasNext()) {
                    Emp e = (Emp)i.next();
                    e.display();
                }

            }
            if(ch1==3) {
                Iterator i=al.iterator();
                while(i.hasNext()) {
                    Emp e = (Emp)i.next();
                    e.raiseSalary();
                }
            }
            if(ch1==4) {
                System.out.println("Thank you...!");System.exit(0);
            }
        }while(ch1!=5);
    }
}
