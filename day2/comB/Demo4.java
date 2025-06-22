package day2.comB;

class Parent{
    int site = 4;
    int money = 5000;
    String car = "BMV";

    void use(){
        System.out.println("Site: " + site);
        System.out.println("Money: " + money);
        System.out.println("Car: " + car);
    }
}

class Child extends  Parent{
    int money = 20000; //first preference is child
    void use(){
        int money = 1000; // local
        System.out.println("Site: " + site);
        System.out.println("Money Local: " + money);
        System.out.println("Money Child: " + this.money);
        System.out.println("Money Parent: " + super.money); // parent level variable access using super
        System.out.println("Car: " + car);
    }

    void abc(){
        System.out.println(money); // 20000
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.use();

        Child child = new Child();
        child.use();
    }
}

// super - parent class level variables and methods
// this - child or current class level variables and methods
// nothing - will access the current method / local variable

