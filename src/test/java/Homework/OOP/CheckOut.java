package Homework.OOP;

public class CheckOut {

    public String paymentOption(String paymentOption){
        if(paymentOption.equalsIgnoreCase("Credit Card")){
            return "Payment selected by user: Credit Card" + " Thank you for your purchase";
        }else if (paymentOption.equalsIgnoreCase("Debit Card")){
            return "Payment selected by user: Debit Card " + " Thank you for your purchase";
        }else if (paymentOption.equalsIgnoreCase("Bitcoin")){
            return "Payment selected by user: Bitcoin" + " Thank you for your purchase";
        }else if (paymentOption.equalsIgnoreCase("Paypal")) {
            return "Payment selected by user: Paypal" + " Thank you for your purchase";
        }else{
          return "Invalid payment option";
        }
    }

}
