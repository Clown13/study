package oop;

public class Abstraction {
    //When you create abstract class, it cannot be instantiated directly, meaning you cannot create BankAccount objects.
    static abstract class BankAccount {
        protected double balance;
        // Create a constructor to get the balance from temporary.
        public BankAccount (double balance) {
            this.balance = balance;
        }
        //Regular Method
        public void getBalance() {
            System.out.println("Current Balance" + balance);
        }
        //Abstract Method
        public abstract void calculateInterest(); //Abstract Methods don't hold implementations.
    }

    //Create subclasses SavingsAccount and CheckingAccount.
    static class SavingsAccount extends BankAccount {
        private double interestRate = 0.03;
        public SavingsAccount (double balance) {
            super(balance);
        }

        @Override
        public void calculateInterest() {
            double interest = interestRate * balance;
            System.out.println("Savings Account Interest: " + interest);

        }
    }
    static class CheckingAccount extends BankAccount {
        private double transactionFee = 2.00;
        public CheckingAccount (double balance) {
            super(balance);
        }

        @Override
        public void calculateInterest() {
            System.out.println("There is no Interest in CheckingAccount");
        }

        public void deductFee () {
            balance -= transactionFee;
            System.out.println("Transaction Fee of $" + transactionFee + " is deducted. New Balance is : " + balance );
        }

    }

    public static void main(String[] args) {
//        SavingsAccount savings = new SavingsAccount(1000.00);
//        savings.getBalance();
//        savings.calculateInterest();
//
//        CheckingAccount checking = new CheckingAccount(500.00);
//        checking.getBalance();
//        checking.deductFee();

        //Adding Polymorphism together with abstract. BankAccount to manage objects of its subclasses.
        BankAccount [] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount(1000.00);
        accounts[1] = new CheckingAccount(500.00);

        for (BankAccount account: accounts) {
            account.getBalance();
            account.calculateInterest();
            if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
        }


        }

    }


}
