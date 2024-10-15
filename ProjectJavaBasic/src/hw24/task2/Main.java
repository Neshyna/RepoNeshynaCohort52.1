package hw24.task2;

import lesson24.interfaces.Book;

public class Main {

    public static void main(String[] args) {

        ElectronicWallet electronicWallet = new ElectronicWallet(100," dollars");
        BankAccount bankAccount = new BankAccount(200, " euro");

        System.out.println("=======electronic wallet==========");
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer();

        electronicWallet.setAmount(600);
        electronicWallet.withdrawMoney();

        System.out.println("====bank account=======");
        bankAccount.checkBalance();
        bankAccount.depositTransfer();

        bankAccount.setAmount(900);
        bankAccount.withdrawMoney();

        System.out.println("===transfer money===");
        electronicWallet.setReceiver("Bank");
        electronicWallet.setSender("Wallet");
        electronicWallet.setAmount(300);
        electronicWallet.setCurrency("dollars");
        electronicWallet.transferMoney();

        bankAccount.setReceiver("wallet");
        bankAccount.setSender("bank");
        bankAccount.setCurrency("euro");
        bankAccount.setAmount(500);
        bankAccount.transferMoney();

        bankAccount.setReceiver("Bank");
        bankAccount.setSender("bank");
        bankAccount.setCurrency("euro");
        bankAccount.setAmount(500);
        bankAccount.transferMoney();

        bankAccount.setReceiver("wallet");
        bankAccount.setSender("wallet");
        bankAccount.setCurrency("euro");
        bankAccount.setAmount(500);
        bankAccount.transferMoney();

    }
}
