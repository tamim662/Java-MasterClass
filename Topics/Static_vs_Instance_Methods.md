### Static vs Instance Methods
#### Static Methods
- Static methods are declared using "static" modifier.
```Java
    public static void func() {}
```
- Static method can't access instances methods and instance variable directly.
- They are usually used for operations that don't require any data from an instace of the class(from 'this'). **'this' keyword is current class instance variable.** 
- Whenever you see a method that doesn't use instance variables that method should probably be declared as a static method.
```Java
class Calculator {
    public static void printSum(int a, int b) {
        Sustem.out.println("Sum = " + (a + b));
    }
}
public class Main {
    public static void main(String args[]) {
        Calculator.printSum(2, 3); // static methods are called as "className.methodName()"
        printHello(); // or "methodName()"; only if in the same class.
    }
    public static void printHello() {
        System.out.println("Hello");
    }
}
```
***So static methods don't require an instance to be created we just typed a class name dot method name to access them.***
#### Instance Methods
- Instance methods belong toan instance class.
- To use an instance method we have to instantiate the class first by using **new** keyword.
```Java
className object = new className(); // this object refer as an instance
```
- Instance methods can access instances methods and instance variable directly.
- Instance methods can also access static methods and static variables directly.
```Java
class Dog {
    public void bark() {
        //instance method
        System.out.println("woof");
    }
}
public class Main() {
    public static void main(String args[]) {
        Dog rex = new Dog(); // create instance
        rex.bark(); // call instance method
    }
}
```
***If a method itself use any fields(instance varibale) or instance methods it should probably be an instance method otherwise be a static method.***
