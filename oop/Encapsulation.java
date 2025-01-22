package oop;
import exceptions.InsufficientFundsException;

//Adding session for Custom Exception for Java Core Study Unit 1. Please see the exceptions package.
public class Encapsulation {
    static class BankAccount {
        //Setting a private variable for encapsulation review of having data protection.
        private double balance;

        //Create a constructor to set the temporary value to instance variable.
        public BankAccount (double balance) {
            if (balance >= 0 ) {
                this.balance = balance;
            }
            else {
                throw new IllegalArgumentException("Balance cannot be negative");
            }

        }
        // Now that the constructor has the balance value initialized, you can do the setters/getters to control the accesses

        //Getter to get the current balance.
        public double getBalance() {
            return balance;
        }
        //Setter to set the deposit to private balance, and adding control to what can be deposited.
        public void deposit(double amount) {
            if (amount > 0 ) {
                balance += amount;
                System.out.println("Deposited: " + amount + ". New balance is: " + balance);
            }
            else {
                throw new IllegalArgumentException("You cannot deposit Negative balance");
            }

        }

        //Setter to set the withdraw from private balance, and control what can be withdrawn.
        public void withdraw(double amount) throws InsufficientFundsException{
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("You have withdrawn " + amount + ". Your new balance is: " + balance);
        }

            else if ( amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Cannot Withdraw " + amount);
            }
            else {
                throw new IllegalArgumentException("The withdraw amount must be positive");

            }

            }

    }

    public static void main(String[] args) {
        // Test valid operations
        try {
            BankAccount account = new BankAccount(200.00);
            System.out.println("Initial balance: " + account.getBalance());
            account.deposit(20.00);
            account.withdraw(70.00);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("Custom Error: " + e.getMessage());
        }

        // Test invalid operations
        try {
            BankAccount account = new BankAccount(200.00);
            account.withdraw(2999.00); // Insufficient funds
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }catch (InsufficientFundsException e) {
            System.err.println("Custom Error: " + e.getMessage());
        }

        try {
            BankAccount account_two = new BankAccount(-50.00); // Negative balance
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            BankAccount account = new BankAccount(100.00);
            account.deposit(-50); // Negative deposit
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }



}
