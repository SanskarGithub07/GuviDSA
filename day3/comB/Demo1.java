package day3.comB;

//Compile and Run Time Polymorphism

class Bank{
    void rateOfInterest(){
        System.out.println("!....10%");
    }
}
class Sbi extends Bank{

    @Override
    void rateOfInterest(){
        System.out.println("!...20%");
    }

}
class Axis extends Bank{

    @Override
    void rateOfInterest(){
        System.out.println("!...30%"); // Same method name same signature but different implementation
    }

}

class Emp{
    Emp(){
        System.out.println("Emp");
    }
    Emp(int uid, String name, String desig){
        System.out.println("3 params");
    }
    Emp(int uid, String name, int age, int salary, String desig){
        System.out.println("5 params");
    }

    void draw(){
        System.out.println("Just draw");
    }

    void draw(int r){
        System.out.println("Draw a circle: " + (2 * Math.PI * r));
    }

    void draw(int l, int b){
        System.out.println("Draw a rectangle: " + (l * b));
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Axis axis = new Axis();
        axis.rateOfInterest();

        Emp emp = new Emp(3, "Name", "Clerk");
        emp.draw(4);
    }
}
