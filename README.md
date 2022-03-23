# Java-MasterClass
This repository consists of all codes of exercise and challenges from java masterclass course of Tim Buchalka's Learn Programming Academy.


### Constructor Concept
> Constructor allow us to initialize a object that we are going to create with some privilage(what we want to do at the time the object being created)

- onstructor can be overloaded like methods. that meanswe can have more then one constructoraccording to the number of parameter changes.
- We can add some default values to the constructorn while object will created with some default values despite having empty constructor called.

**Here the code sample given below;**
`code`
  public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "default phone"); // default constructor and it will call the same contsructor below with parameters with these default value.
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
    
   In that code, the 2nd constructor will called first for seeting default value in the 1st constructor and then "Empty constructor called" line will show as a output.

