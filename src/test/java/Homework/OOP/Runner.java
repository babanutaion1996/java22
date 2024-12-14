package Homework.OOP;


import java.util.Scanner;

public class Runner {
        public static void main(String[] args) {
        GrocceryList groceryList = new GrocceryList();
        Scanner scanner = new Scanner(System.in);
        boolean runList = false;


     while(!runList)

        {
            System.out.println("\nPress ");
            System.out.println("\t0 - To Print Grocery Menu.");
            System.out.println("\t1 - To Add an Item to the List.");
            System.out.println("\t2 - To Modify an Item in the List.");
            System.out.println("\t3 - To Remove an Item from the List.");
            System.out.println("\t4 - To Search for an Item in the List.");
            System.out.println("\t5 - To Check Out the Cart.");
            System.out.println("\t6 - To Payment.");
            System.out.println("\t7 - To Quit the Application.");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 0:
                    groceryList.printFruits();
                    groceryList.printVegetables();
                    groceryList.printproducts();
                    break;
                case 1:
                    System.out.print("Enter the product name to add: ");
                    String product = scanner.nextLine();
                    groceryList.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter the position to modify: ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the product name :");
                    String newItem = scanner.nextLine();
                    groceryList.modifyList(position,newItem);
                    break;
                case 3:
                    System.out.println("Enter product name to remove:");
                    String removeItem = scanner.nextLine();
                    groceryList.removeProduct(removeItem);
                    break;
                case 4:
                    System.out.println("Please enter the product to search");
                    String searchItem = scanner.nextLine();
                    int index = groceryList.findProduct(searchItem);
                    if(index >= 0){
                        System.out.println(searchItem + "found at position" + index);
                    }else {
                        System.out.println(searchItem + "Item nod found in the list");
                    }
                    break;
                case 5:
                    System.out.println("Your shopping list" + groceryList.getshoppingList());
                    System.out.println("Total price" + groceryList.getTotalPrice());
                    break;
                case 6:
                    groceryList.makePayment();
                    break;
                case 7:
                    runList = true;
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }


        }


    }
}