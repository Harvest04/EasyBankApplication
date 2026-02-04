package easybankapplication;

import easybank.account.BankAccount;
import easybank.services.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class EasyBankApplication {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        BankAccount account = new BankAccount(1000.00);

        DepositService depositService = new DepositService();
        WithdrawalService withdrawalService = new WithdrawalService();
        AirtimeService airtimeService = new AirtimeService();
        ElectricityService electricityService = new ElectricityService();

        int choice;

        do {
            System.out.println("\n=== EasyBank Application ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Buy Airtime");
            System.out.println("5. Buy Electricity");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: R" + formatter.format(account.getBalance()));
                    break;

                case 2:
                    System.out.print("Enter deposit amount: R");
                    depositService.depositMoney(account, input.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: R");
                    withdrawalService.withdrawMoney(account, input.nextDouble());
                    break;

                case 4:
                    System.out.print("Enter airtime amount: R");
                    airtimeService.buyAirtime(account, input.nextDouble());
                    break;

                case 5:
                    System.out.print("Enter electricity amount: R");
                    electricityService.buyElectricity(account, input.nextDouble());
                    break;

                case 0:
                    System.out.println("Thank you for using EasyBank!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 0);

        input.close();
    }
}

