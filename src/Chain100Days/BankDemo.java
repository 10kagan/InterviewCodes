package Chain100Days;

import java.time.LocalDate;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount saving = new SavingAccount("SA-001", "Alice", 1000.0, 0.01);
        BankAccount checking = new CheckingAccount("CA-001", "Bob", 500.0, 200.0);
        BankAccount fixed = new FixedDepositAccount("FD-001", "Charlie", 2000.0, 0.02, LocalDate.now().plusMonths(6));

        saving.deposit(100);
        checking.withdraw(100);

        saving.applyMonthlyInterest();
        fixed.applyMonthlyInterest();

        System.out.println(saving);
        System.out.println(checking);
        System.out.println(fixed);
    }
}

// Design a class hierarchy for different types of accounts in a bank