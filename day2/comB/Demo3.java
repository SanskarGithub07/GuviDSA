package day2.comB;

class Car{

    int model = 2000;
    void display(){
        System.out.println("Instance method... !");
    }
    static int speed = 250;
    static void gear(){
        System.out.println("5 gears...!");
        System.out.println("Static method");
    }
}
public class Demo3 {
    static void display(){
        System.out.println("Helli display");
    }
    public static void main(String[] args) {
//        Car benz = new Car();
//        System.out.println(benz.speed); // With object only we can access
//        benz.gear();

        //If we want to access without creating the object declare as static
        // Classname.attributeName
        // Classname.methodName
        //There are two types of variables instance and static variables

        Car.gear();
        System.out.println(Car.speed);
        Car car = new Car();
        System.out.println(car.model);
        car.display();

        display();
    }
}

// If we create it in the same class no need to specify the class name
// Since main method is static we don't need an object to call main method
