package hw24.task2;

public class BankAccount implements PaymentSystem{

    double amount = 0;
    String currency;

    String sender ;
    String receiver;

    public BankAccount(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public void withdrawMoney() {
        System.out.println("withdraw  " + amount + currency);
    }

    @Override
    public void depositTransfer() {
        System.out.println("deposit  " + amount + currency);
    }

    @Override
    public void checkBalance() {
        System.out.println("check balance  " + amount + currency);
    }

    @Override
    public void transferMoney() {
        System.out.printf("transfer %f %s from %s to %s\n" ,amount,currency,sender,receiver);
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
