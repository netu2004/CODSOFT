public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawal successful");
        }else{
        System.out.println("Insufficient balance");
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit successful.New balance:"+balance);
    }
}
