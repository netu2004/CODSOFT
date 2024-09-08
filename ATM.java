import java.util.Scanner;
public class ATM {
    private BankAccount account;

    public ATM(BankAccount account){
        this.account=account;
    }
    public void run(){
        Scanner scanner=new Scanner(System.in);
            System.out.println("Welcome to the ATM!");
            while(true){
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option:");
            int opt=scanner.nextInt();
            switch(opt){
                case 1:withdraw(scanner);
                        break;
                case 2:deposit(scanner);
                        break;
                case 3:checkBalance();
                        break;
                case 4:System.out.println("Thank You");
                        return;
                default:System.out.println("Invalid Option");
            }
        }
    }
    private void withdraw(Scanner scanner){
        System.out.println("Enter amount to withdraw:");
        double amount=scanner.nextDouble();
        account.withdraw(amount);
        }
    private void deposit(Scanner scanner){
        System.out.println("Enter amount to deposit:");
        double amount=scanner.nextDouble();
        account.deposit(amount);
        
    }
    private void checkBalance(){
        System.out.println("Current Balance:"+account.getBalance());
    }
}

