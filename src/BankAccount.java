public class BankAccount {
    private String fullName;
    private int balance=0;

    public BankAccount(String fullName) {
        this.fullName = fullName;

    }
    public String getFullName() {
        return fullName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


}
