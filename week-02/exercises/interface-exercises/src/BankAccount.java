public class BankAccount implements MoneyStorage{

    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getDescription() {
        return String.format("Bank account: $s",accountNumber);
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0.0) {
            balance =+ amount;
            return true;
        }
        return false;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= -25.00) {
            return -25.00;
        }
        double result = amount;
        balance -= result;
        return result;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
