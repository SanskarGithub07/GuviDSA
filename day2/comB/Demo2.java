package day2.comB;

class A{
    A(){
        System.out.println("A class");
    }

    void display(){
        System.out.println("hi method");
    }
}

class B{
    B(){
        System.out.println("B class");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Demo2 Class");
        A a = new A();
        A a1 = new A();

        a.display();
        B b = new B();
    }
}
//Constructor                                                                                   // Methods
//As soon as we create an object the default constructor gets called automatically              //Manually called
// Method name and constructor name should be same                                              // Method names can be different
// No return type                                                                               // Returns something
// Called once                                                                                  // Can be called many times