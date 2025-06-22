package day2.comA;

class A{
    static{
        System.out.println("This is static block");
    }
    {
        // Check if amount is empty or not
        System.out.println("This is an instance block, i'll execute for every object creation....");
    }
    A(){
        {
            System.out.println("Hi");
            //some logic
            // Deposit salary to employees
        }
        System.out.println("Hi Constructors...!");
    }

    void display(){
        System.out.println("Display method.");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = new A();

        a.display();
    }
}

// static block gets executed only once per class
