package Homework.OOP;

public class GroceryBuddy extends CheckOut {
    String[] fruits = {"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape", "Mango", "Strawberry", "Peach", "Cherry"};
    double[] fruitsPrices = {2.0, 3.0, 4.0, 1.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    String[] vegetables = {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber", "Corn", "Bean", "Spinach", "Pepper"};
    double[] vegetablesPrices = {4.0, 5.0, 4.0, 9.0, 2.0, 3.1, 7.2, 8.4, 9.2, 10.2};
    String[] products = {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar", "Salt", "Coffee", "Rice", "Pasta"};
    double[] productsPrices = {2.33, 5.44, 6.22, 1.12, 5.42, 5.12, 5.12, 4.12, 4.12, 3.99};


    public void showFruits() {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " $" + fruitsPrices[i]);
        }
    }

    public void showVegetables() {
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println(vegetables[i] + "$" + vegetablesPrices[i]);
        }
    }

    public void showProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + "$" + productsPrices[i]);
        }
    }

    public double itemPrice(String productName) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(productName)) {
                return fruitsPrices[i];
            }
        }
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].equalsIgnoreCase(productName)) {
                return vegetablesPrices[i];
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productName)) {
                return productsPrices[i];
            }
        }
        return 0.0;
    }

}


