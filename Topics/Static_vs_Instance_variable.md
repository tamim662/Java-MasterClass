### Static vs Instance variable

#### Static variable
- Declared by using the keyword 'static'.
- Static variables are also known as static member variables.
- Every instance of that class shares the same static variable.
- If changes are made to that varibale, all other instance will see the effect of the change.
```java
public class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }
    public void printName() {
        System.out.println("name= " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex"); //create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy
    }
}
```
***Printed same output because static variables are shared between instances so in other words once we change the static variable all instances will see that change we made***.

#### Instance varibale
- Instance varibales are also known as fields or member variables.
- Instance varibale belong to an instance of a class.
- Every instance has it's own copy of an instance variables.
- Every instance can have different value(state).
- Instance variables represents the state of an instance.
```java
public class Dog {
    
    private String name;

    public Dog(String name) {
        Dog.name = name;
    }
    public void printName() {
        System.out.println("name= " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex"); //create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName(); // prints rex
        fluffy.printName(); // prints fluffy
    }
}
```
