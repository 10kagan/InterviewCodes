package Chain100Days;

import java.time.LocalDate;

abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public BankAccount (String accountNumber, String ownerName, double initialBalance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit (double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void applyMonthlyInterest(){

    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName +  '\'' +
                ", balance=" + balance +
                '}';
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds in savings account");
        }

        balance -= amount;
    }

    @Override
    public void applyMonthlyInterest() {
        balance += balance * interestRate;
    }
}

class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit){
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (balance - amount < -overdraftLimit){
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }
        balance -= amount;
    }
}

class FixedDepositAccount extends BankAccount{
    private LocalDate maturityDate;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, String ownerName, double initialBalance, double interestRate,
                               LocalDate maturityDate){
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    @Override
    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(maturityDate)) {
            throw new IllegalStateException("Cannot withdraw before maturity date");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public void applyMonthlyInterest(){
        balance += balance * interestRate;
    }
}

// Design a class hierarchy for different types of accounts in a bank