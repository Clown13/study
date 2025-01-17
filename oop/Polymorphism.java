package oop;

public class Polymorphism {
    static class BankAccount {
        protected double balance;

        //Constructor to initialize balance variable
        public BankAccount (double balance) {
            this.balance = balance;
        }

        //Generic Interest Calculation to be overriden by subclasses to provide specific interest rate.
        public void calculateInterest() {
            System.out.println("Generic interest calculation for a bank account.");
        }
        //To show the current Balance
        public void getBalance() {
            System.out.println("Current Balance: " + balance );
        }
    }
    // Creating static class SavingAccount which extends BankAccount (subclass of the parent class BankAccount)
    static class SavingAccount extends BankAccount {
        //3% Annual Interest rate for saving account.
        private double interestRate = 0.03;
        //Constructor
        public SavingAccount (double balance) {
            super(balance); // Call the parent class constructor to initialize balance.
        }
        @Override
        public void calculateInterest(){
            double interest = balance * interestRate;
            System.out.println("Saving Account Interest: $" + interest);

        }
    }
    //Create Cheque Account.
    static class ChequeAccount extends BankAccount {
        private double transactionFee = 1.00;
        public ChequeAccount (double balance) {
            super(balance);
        }
        @Override
        public void calculateInterest() {
            System.out.println("Cheque Account does not have Interest");
        }

        public void Fee() {
            balance -=transactionFee;
            System.out.println("Transaction fee of $" + transactionFee + " is deducted, remaining balance: $" + balance);
        }

    }
    public static void main(String[] args) {
//        SavingAccount savings = new SavingAccount(1000.00);
//        savings.getBalance();
//        savings.calculateInterest();
//
//        ChequeAccount cheques = new ChequeAccount(500.00);
//        cheques.getBalance();
//        cheques.calculateInterest();
//        cheques.Fee();

        // The above code can be reduced by referencing the object types.
        BankAccount savings = new SavingAccount(1000.00);
        BankAccount checking = new ChequeAccount(500.00);
        savings.getBalance();
        savings.calculateInterest();
        checking.getBalance();
        checking.calculateInterest();
        //Downcast Little confusing but understand that this is required when using polymorphism and you're trying to use method of child class where it does not exist in parent.
        if (checking instanceof ChequeAccount) {
            ChequeAccount chequeAccount = (ChequeAccount) checking; // Downcast
            chequeAccount.Fee(); // Call the Fee() method
        }

    }
}
