class SavingAccount 
{
    // Instance variables (State)
    long accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize a new account
    SavingAccount(long accountNumber, String accountHolderName, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to check available balance
    void checkBalance() 
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Available Balance: Rs. " + balance);
    }

    // Method to deposit money
    void deposit(double amount) 
    {
        System.out.println("Depositing Rs. " + amount + "...");
        balance = balance + amount; // Add the deposit to the total balance
        System.out.println("Success! New Balance is: Rs. " + balance);
        System.out.println("-----------------------------------");
    }

    // Method to withdraw money (with validation logic!)
    void withdraw(double amount) 
    {
        System.out.println("Attempting to withdraw Rs. " + amount + "...");
        
        // Validation: Check if they have enough money to withdraw
        if (amount <= balance) 
        {
            balance = balance - amount; // Deduct the money
            System.out.println("Success! Please collect your cash.");
            System.out.println("Remaining Balance: Rs. " + balance);
        } 
        else 
        {
            System.out.println("Transaction Failed: Insufficient funds.");
            System.out.println("Available Balance is only Rs. " + balance);
        }
        System.out.println("-----------------------------------");
    }
}

public class Program10 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Welcome to the Bank --- \n");

        // 1. Create a new Saving Account for Rahul with Rs. 5000
        SavingAccount myAccount = new SavingAccount(100123456L, "Rahul", 5000.00);

        // 2. Check initial balance
        myAccount.checkBalance();
        System.out.println("-----------------------------------");

        // 3. Deposit some money (Balance becomes 7000)
        myAccount.deposit(2000.00);

        // 4. Try to withdraw a valid amount (Balance becomes 4000)
        myAccount.withdraw(3000.00);

        // 5. Try to withdraw an invalid amount (More than what's in the account)
        myAccount.withdraw(10000.00);
        
        System.out.println("\n--- Thank you for banking with us ---");
    }
}