public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Your deposit must be greater than zero");
            return;
        }
        balance += amount;
    }

    public void widthdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    public void displayBalance() {
        System.out.println(accountHolder);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "John Doe", 500.0);
        acc.deposit(-1);
        acc.widthdraw(100);
        acc.displayBalance();
    }
}
