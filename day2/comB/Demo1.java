package day2.comB;

//Parent class also known as super class or base class
class C{

    int a = 100;
    int b = 200;
    void m1(){
        System.out.println(a + b);
    }
}


//Child class is also known as subclass or derived class
class D extends C{
//    int a = 100;
//    int b = 200;
    int c = 300;
    int d = 400;

//    void m1(){
//        System.out.println(a + b);
//    }

    void m2(){
        System.out.println(c + d);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Day 2 Demo1 ...!");

        D d = new D();

        System.out.println();
    }
}
