package day5.comB;

interface Bank{
    void ROI();
    void OT();
    void withdraw();
}

public class Demo1 {
    public static void main(String[] args) {

    }
}

// Interface can contain only abstract methods and cannot contain non-abstract methods
// Any class implementing an interface has to override all the interface's methods.
// abstract modifier is redundant on interface methods, it won't give an error if written that way.

// We can have instance variables and constructors in abstract classes but not in interfaces
// Hiding the implementation by showing only the method names

// Interface can extend multiple interfaces multiple inheritance


