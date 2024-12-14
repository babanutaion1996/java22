package Abstraction;

public abstract class Payment {
    String playerName;

    public Payment(String playerName){
        this.playerName = playerName;
    }

    // Abstract method to be implemented by subclasses(Child classes).

    abstract void processPayment(double amount);

    // Concrete method
    void transactionDetails(double amount){
        System.out.println("Transcation detials:");
        System.out.println("Payer:" + playerName);
        System.out.println("Amount: " + amount);
    }

}
