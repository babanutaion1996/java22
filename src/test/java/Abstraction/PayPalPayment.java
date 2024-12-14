package Abstraction;

public class PayPalPayment extends Payment{

    String email;
    public PayPalPayment(String playerName,String email){
        super(playerName);
        this.email = email;
    }

    @Override
    void processPayment(double amount){
        System.out.println("Processing the PayPal payment.......");
        System.out.println("Payer: " + super.playerName);
        System.out.println("Amount : $" + amount);
        System.out.println("Payment successful via PayPal");
    }

}
