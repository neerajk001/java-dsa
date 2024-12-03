Function Overloading
Function overloading in Java means having multiple methods with the same name but different parameter lists within the same class. The compiler differentiates these methods by their method signature, which includes:

The number of parameters
The type of parameters
The order of parameters
Example:
java
Copy code
class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Calls the first method
        System.out.println(calc.add(2.5, 3.5)); // Calls the second method
        System.out.println(calc.add(1, 2, 3)); // Calls the third method
    }
}
Key Points:
Function overloading is resolved at compile-time (compile-time polymorphism).
Return type alone cannot differentiate overloaded methods.
Call by Value
In Java, method arguments are always passed using call by value, meaning that a copy of the argument's value is passed to the method. Any changes made to the parameter inside the method do not affect the original value.

Example:
java
Copy code
class Test {
    void modifyValue(int x) {
        x = 50; // This change will not affect the original variable
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Test test = new Test();
        System.out.println("Before method call: " + a); // Prints 10
        test.modifyValue(a);
        System.out.println("After method call: " + a); // Still prints 10
    }
}
Key Points:
For primitives, the actual value is passed.
For objects, the reference (memory address) is passed, but it’s still call by value because the reference itself is copied.