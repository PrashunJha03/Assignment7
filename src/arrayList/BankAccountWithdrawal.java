package arrayList;
import java.util.Scanner;

class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    void withdraw(double amount) {

        if (amount <= 0) {

            throw new ArithmeticException("Withdrawal amount must be positive.");

        }

        if (amount > balance) {

            throw new ArithmeticException("Insufficient balance.");

        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}


public class BankAccountWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a = new Account();

        a.accountNumber = 101;
        a.accountHolderName = "Prashun";
        a.balance = 5000;

        System.out.println("Account Number: " + a.accountNumber);
        System.out.println("Account Holder: " + a.accountHolderName);
        System.out.println("Balance: " + a.balance);

        System.out.print("\nEnter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            a.withdraw(amount);

        }
        catch (ArithmeticException e) {

            System.out.println("Withdrawal failed.");
            System.out.println("Reason: " + e.getMessage());

        }
        finally {

            System.out.println("Transaction completed.");
        }

        sc.close();
    }
}