# Java-MasterClass
This repository consists of all codes of exercise and challenges from java masterclass course of Tim Buchalka's Learn Programming Academy.

## Object-Oriented Programming
Real World objects have two major characterisitcs.
>> 1. The state
>> 2. Behavior

**Example:** For the Ant;
- **The state:** The age, the number of legs, etc. 
- **Behavior:** Eating, Carrying food, etc.

> Software objects are a fundamental part of OOP. A software object store its state in fields(variables) and they expose their behavior with methods. This is what an object in object-oriented programming terms.
>> - And a class is a template or a blueprint for creating objects.
>> - Varibales in class = memeber variables = fields = state components
>> - A powerful mecanism is used to hide the fields and methods from access publicly and that is called Encapsulation.

**Most understandable Defination**: Object-Oriented Programming (OOP) is the term used to describe a programming 
approach based on objects and classes. The object-oriented paradigm allows us 
to organise software as a collection of objects that consist of both data and 
behaviour.

### Constructor Concept
- Constructor allow us to initialize a object that we are going to create with some privilage(what we want to do at the time the object being created)
- Constructor can be overloaded like methods. that means we can have more then one constructor according to the number of parameter changes.
- We can add some default values to the constructor while object will created with some default values.

**Here the code sample given below;**

```java
 public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() { // First constructor
        this("56789", 2.50, "Default name", "Default address", "default phone"); // constructor with default values and it will call the same contsructor below with parameters with these default value.
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
 }
 ```
    
   In that code, the 2nd constructor will called first for setting default value in the 1st constructor and then "Empty constructor called" line will show as a output.

- [Difference between static methods and instance methods](https://github.com/tamim662/Java-MasterClass/blob/main/Topics/Static_vs_Instance_Methods.md#static-vs-instance-methods).
- [Difference between static variables and instance variables](https://github.com/tamim662/Java-MasterClass/blob/main/Topics/Static_vs_Instance_variable.md#static-vs-instance-variable).
