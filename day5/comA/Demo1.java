package day5.comA;
abstract class Bank{
    abstract void ROI();

    abstract void OT();
    void display(){
        System.out.println("Hello");
    }
}

class Sbi extends Bank{
    @Override
    void ROI(){
        System.out.println("15%");
    }

    @Override
    void OT() {
        System.out.println("yes we have");
    }
}

class Axis extends Bank{
    @Override
    void ROI(){
        System.out.println("20%");
    }

    @Override
    void OT() {
        System.out.println("Yes we can");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        sbi.ROI();;
        Axis axis = new Axis();
        axis.ROI();
        sbi.display();
    }
}

// Hide implementation - Make class abstract
// All methods inside the abstract class are abstract or have their body declared and implemented
// If any class extends the abstract class we must have to override all abstract methods

// Properties of an abstract class
// Abstraction - We can hide the implementation only showing the functionality to the end user
// If method is abstract class must also be abstract
// If class is abstract we cannot create an object of abstract class
// We can provide our own implementation for the abstract methods thus, we cannot skip when extending

// Drawback

