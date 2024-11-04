public class BankAccount {  
    private int numberAccount;
    private double balance;
    private String typeAccount;

    public BankAccount(){
        this.numberAccount =-1;
        this.balance = 0;
        this.typeAccount = "undefined";
    }

    public BankAccount(int numberAccount, String typeAccount){
        this.numberAccount = numberAccount;
        this.balance = 0;
        this.typeAccount = typeAccount;
    }

    public BankAccount(int numberAccount, double balance, String typeAccount) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    @Override
    public String toString() {
        return "BankAccount [numberAccount=" + numberAccount + ", balance=" + balance + ", typeAccount=" + typeAccount
                + "]";
    }

    
}
