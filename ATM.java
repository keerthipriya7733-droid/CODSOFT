package Task3_ATMInterface;

import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }
    
public void start(){
    Scanner sc = new Scanner(System.in);
    int choice;

    do{
        System.out.println("\n=========== ATM MENU ===========");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Exit ");
        System.out.println("==================================");

        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                account.checkBalance();
                break;
            case 2:
                System.out.println("Enter deposit amount: ");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter Withdrawal amount: ");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank You for using ATM! ");
                break;
            default:
                System.out.println("Invalid choice! Try again. ");
                break;
        }
    } while (choice != 4);

    sc.close();
}
}