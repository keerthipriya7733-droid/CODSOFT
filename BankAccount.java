package Task3_ATMInterface;

public class BankAccount {
    private int balance;
    
    BankAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance() {
        System.out.println("Current balance:  Rs" + balance);
           
    }
    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit Successful...");
            System.out.println("Current Balance:  Rs" + balance);
        }
        else{
            System.out.println("Invalid deposit amount! ");
        }
    }
    public void withdraw(int amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount! ");
        }
        else if (amount > balance){
            System.out.println("Insufficient amount! ");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful...");
            System.out.println("Current balance: Rs" + balance);
        }
    }
}



