public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFund(100.0);

        bobsAccount.depositeFund(50.0);
        bobsAccount.withdrawFund(100.0);

        bobsAccount.depositeFund(51.0);
        bobsAccount.withdrawFund(10.0);
        bobsAccount.depositeFund(21.0);


    }
}
