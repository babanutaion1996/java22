package Abstraction;

public class CreditCardPayment extends Payment{
    String cardNumber;

    public CreditCardPayment(String playerName,String cardNumber){
        super(playerName);
        this.cardNumber = cardNumber;
    }
    @Override
    void processPayment(double amount){
        System.out.println("Processing the credit payment.......");
        System.out.println("Payer: " + super.playerName);
        System.out.println("Amount : $" + amount);
        System.out.println("Payment successful via Credit Card");
    }

}
