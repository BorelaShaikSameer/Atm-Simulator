import java.util.Scanner;

class ATM {
    Scanner sc=new Scanner(System.in);
    private String accountHolderName="sameer";
    private long accountNumber=939842801;
    private int pin=1234;
    private int balance= 100000;
    private boolean isAuthenticated=false;
    public void validatePin() {
        System.out.println("enter your pin");
        int inputPin=sc.nextInt();
        if(inputPin== pin) {
            isAuthenticated=true;
            System.out.println("Welcome");
            displayMenu();
        }
        else {
            System.out.println(" Error pin doesn't match");
            validatePin();
        }
    }
    public void  displayMenu() {
        System.out.println(" Choose available option");
        System.out.println("1 Check balance \t 2 Deposit Money \t"
                + " 3 Withdraw Money\t 4 Exit");
        int choose=sc.nextInt();
        switch(choose) {
            case 1:
                checkBalance();
                break;
            case 2:
                DepositMoney();
                break;
            case 3:
                WithdrawMoney();
                break;
            case 4:
                Exit();
                break;
            default:
                System.out.println("invalid option");
        }
    }

    public void  checkBalance() {
        System.out.println("available balance is " +  balance);
        displayMenu();
    }
    public void DepositMoney() {
        System.out.println(" enter the amount you want to deposit");
        int amount=sc.nextInt();
        System.out.println(" your current deposit" + amount);
        balance+=amount;
        System.out.println(" after deposit new Balance" + balance);
        displayMenu();

    }
    public void WithdrawMoney() {
        System.out.println(" enter the amount to Withdraw ");
        int Money=sc.nextInt();
        if(balance < Money) {
            System.out.println("insuffecient balance");
        }
        else {
            System.out.println(Money+" with drawn successfully");
        }
        balance-=Money;
        System.out.println("availble balance" + balance);
        displayMenu();
    }
    public void Exit() {
        System.out.println("Thank you");

    }
}
public class GuessNumber{
    public static void main(String[] args) {
        ATM a=new ATM();
        a.validatePin();
    }
}
