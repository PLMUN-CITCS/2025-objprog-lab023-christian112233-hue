class BankAccount {
    String accountHolder;
    String accountType;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to display account details
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("Alice", "Checking", 1150.0);
        myAccount.displayInfo();
    }
}
