system.out.println("hello");

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(30);
        account.displayBalance();
    }
}