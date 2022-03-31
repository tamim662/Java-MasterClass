public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public long getPhoneNumber() {
        return this.phoneNumber;
    }
    public void depositeFund(double amount) {
        this.balance += amount;
        System.out.println("Your new Balance is: " + this.balance);
    }
    public void withdrawFund(double amount) {
        if(  this.balance<=0 || this.balance<amount) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
            System.out.println("Your new Balance after withdraw is: " + this.balance);
        }
    }
}
