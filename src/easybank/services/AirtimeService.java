package easybank.services;

import easybank.account.BankAccount;
import java.text.DecimalFormat;

public class AirtimeService {

    public void buyAirtime(BankAccount account, double amount) {
        
        DecimalFormat formatter = new DecimalFormat("0.00");
        if (account.withdraw(amount)) {
            System.out.println("Airtime purchased successfully for R" + formatter.format(amount));
            System.out.println("Remaining balance: R" + formatter.format(account.getBalance()));
        } else {
            System.out.println("Not enough balance to buy airtime.");
        }
    }
}
