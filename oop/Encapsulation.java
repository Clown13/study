package oop;

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
                System.out.println("You Cannot have negative Balance");
                this.balance = 0;
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
                System.out.println("Deposited: " + amount + ". New Balance is: " + balance );
            }
            else {
                System.out.println("You cannot deposit negative value");
            }

        }

        //Setter to set the withdraw from private balance, and control what can be withdrawn.
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println ("You have withdrawn amount" + amount + "Your new balance is " + balance);
            }
            else {
                System.out.println("You cannot withdraw negative value nor can you withdraw more money than you have.");
            }
        }

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(200.00);
        System.out.println(account.getBalance());
        account.deposit(20.00);
        account.withdraw(70.00);
        account.withdraw(2000); // Withdrawal denied

    }



}
