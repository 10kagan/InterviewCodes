package Chain100Days;

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

class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountNumber, String ownerName, double initialBalance, double interestRate){
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw (double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds in savings account");
        }

        balance -= amount;
    }

    @Override
    public void applyMonthlyInterest(){
        balance += balance * interestRate;
    }


}
