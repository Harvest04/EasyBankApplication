package easybank.services;

import easybank.account.BankAccount;
import java.text.DecimalFormat;

public class ElectricityService {

    public void buyElectricity(BankAccount account, double amount) {
        
        DecimalFormat formatter = new DecimalFormat("0.00");
        if (account.withdraw(amount)) {
            System.out.println("Electricity purchased successfully.");
            System.out.println("PPA Token Generated: 1234-5678-9012");
            System.out.println("Remaining balance: R" + formatter.format(account.getBalance()));
        } else {
            System.out.println("Insufficient balance for electricity purchase.");
        }
    }
}
