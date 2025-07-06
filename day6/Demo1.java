package day6;

// Hiding the data members is called encapsulation into single class
// Having the methods and attributes inside a class
// Access Modifier - private, public, protected, default
// Non Access Specifier - abstract, final, static
// Linear and Binary Search
class Car{
    final private int speed = 250;
    void accelerate(){

    }

    void carBreak(){

    }

    void gear(){

    }

    public int getSpeed() {
        return speed;
    }

//    public void setSpeed(int newSpeed){
//        this.speed = newSpeed;
//    }
}

class Benz extends Car{

}

class Varna extends Car{

}
public class Demo1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();

//        car.setSpeed(23);
        System.out.println(car.getSpeed());

        Benz b = new Benz();
//        b.setSpeed(25000);

        //A variable declared as final cannot be reassigned
        // A method declared as final cannot be overriden
        // A class declared as final cannot be inherited
    }

}
