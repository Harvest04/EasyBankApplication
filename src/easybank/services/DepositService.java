package easybank.services;

import easybank.account.BankAccount;
import java.text.DecimalFormat;

public class DepositService {

    public void depositMoney(BankAccount account, double amount) {
        
        DecimalFormat formatter = new DecimalFormat("0.00");
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: R" + formatter.format(account.getBalance()));
    }
}
