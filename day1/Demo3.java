package day1;

public class Demo3 {
    public static void main(String[] args) {
        byte a = -20;
        short b = 32767;

        System.out.println(a);
        System.out.println(b);

//        short ranges from -32768 to 32767;
        // size 1byte : 8bit
        // 2^8 : 256
        // half will be positive and half will be negative
        // -128 to + 127 total 256 values
        //byte short int long double float boolean char - 8 primitive types
        // What will be the output of the above code?
        // correct or incorrect if outside byte range error
    }
}

// byte - 8bits
// short - 2byte - 16bits
// int - 4 byte - 32 bits
// long - 8 byte - 64bits
// float - 4 byte - 32bits
// double - 8 byte - 32bits
// char - 2 byte - 16bits
// boolean - 1bit

//Why is java platform independent?
// Since the data types do not change with change of operating systems that is why unlike C java is written once run anywhere
// Source Code -> Byte Code (Does not depend on any OS) -> Execute Anywhere

// Is java compiled or interpreted language
// It is both compiled and interpreted language
// Source code to byte code is done by compiler then the byte code to machine code will be done by the interpreter

// javac Demo1.java
//Demo1.java -> Demo1.class file
// Every class will get converted to .class files
//Interview Question
//.java files will get converted to .class files

//The same java file can have more than one main function
// Main method is necessary to execute the java file with .java
//  As soon as we create an object it automatically calls the constructor
// Not recommended to write many main methods
// If you modify the .class file it will not be able to execute directly recompilation is required

// Not possible to take two classes as public class in a single file
// Also public class name and file name must be same for the class to be public

// File name and public class name must be same in Java must be same is this statement correct or not?
// Classes cannot be private or protected except inner classes
// final classes cannot be inherited
