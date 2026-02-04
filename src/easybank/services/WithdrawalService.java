package easybank.services;

import easybank.account.BankAccount;
import java.text.DecimalFormat;

public class WithdrawalService {

    public void withdrawMoney(BankAccount account, double amount) {
        
        DecimalFormat formatter = new DecimalFormat("0.00");
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: R" + formatter.format(account.getBalance()));
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
