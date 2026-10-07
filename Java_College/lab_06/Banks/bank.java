import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account_number = sc.nextInt();

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        Saving_Account account = new Saving_Account(account_number, balance);

        System.out.print("Enter deposit amount: ");
        int deposit = sc.nextInt();
        account.deposit_money(deposit);

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        account.withdraw_money(withdraw);

        account.check_balance(account_number);
    }
}

interface Bank_Operations {

    void deposit_money(int amount);

    void withdraw_money(int amount);

    void check_balance(int account_number);
}

class Saving_Account implements Bank_Operations {

    int account_number;
    int balance;

    Saving_Account(int account_number, int balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit_money(int amount) {
        balance += amount;
        System.out.println("Deposited amount is : " + amount);
    }

    public void withdraw_money(int amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount is : " + amount);
        } 
        else {
            System.out.println("You can't you don't have this much amount in your bank account !");
        }
    }

    public void check_balance(int account_number) {
        System.out.println("Account Number: " + account_number);
        System.out.println("Current Balance: " + balance);
    }
}