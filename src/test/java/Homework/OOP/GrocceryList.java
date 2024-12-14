package Homework.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrocceryList extends GroceryBuddy {

    private ArrayList<String> purchasedProducts = new ArrayList<>();

    public void makePayment(){
        Scanner scanner = new Scanner(System.in);
        double totalPrice = getTotalPrice();
        double deliveryFee = 6.99;
        double grandTotal = totalPrice + deliveryFee;

        System.out.println("Total price of items: $" + totalPrice);
        System.out.println("Delivery fee: $" + deliveryFee);
        System.out.println("Grand total: $" + grandTotal);

        System.out.println("Choose a payment method (Credit Card, Debit Card, Bitcoin, Paypal):");
        String paymentOption = scanner.nextLine();
        String paymentResult = paymentOption(paymentOption);
        System.out.println(paymentResult);

    }


    public void addProduct(String product) {
        if (itemPrice(product) != 0.0) {
            purchasedProducts.add(product);
            System.out.println(product + " added to the shopping list.");
        } else {
            System.out.println("Product not found.");
        }
    }


    public ArrayList<String> getshoppingList() {
        return purchasedProducts;
    }

    public double getTotalPrice() {
        double total = 0.0;

        for (String item : purchasedProducts) {
            total += itemPrice(item);
        }

        if (total > 100) {
            total *= 0.85;
        } else if (total > 50) {
            total *= 0.90;
        }
       return total;
    }

    public void modifyList(int position, String newItem) {
        if (position >= 0 && position < purchasedProducts.size() && itemPrice(newItem) != 0.0) {
            purchasedProducts.set(position, newItem);
            System.out.println("Item updated to " + newItem);
        } else {
            System.out.println("Invalid position or product not found.");
        }
    }

    public void removeProduct (String product){
        if(purchasedProducts.remove(product)){
            System.out.println(product + "removed from the basket");
        }else {
            System.out.println("Product doesn't exist in the list");
        }
    }

    public int findProduct(String product){
        return purchasedProducts.indexOf(product);
    }

    public void printFruits() {
        showFruits();
    }

    public void printVegetables() {
        showVegetables();
    }

    public void printproducts() {
        showProducts();
    }
}
