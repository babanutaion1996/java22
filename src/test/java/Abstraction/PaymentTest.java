package Abstraction;

public class PaymentTest {
    public static void main(String[] args) {
        // Can I create an object from payment Class

        Payment payment1 = new CreditCardPayment("Jane","123456789");

        payment1.processPayment(41.7);// this will call the processPayment method from CreditCard class.

        Payment  payment2 = new PayPalPayment("Any" ,"jora@gmail.com");
        payment2.processPayment(36.9);

    }
}
