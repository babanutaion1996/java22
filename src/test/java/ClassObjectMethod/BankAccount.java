package ClassObjectMethod;

public class BankAccount {
    String userName, password, bankName = "TestBank";
    double balance;
    boolean isLoggedIn;
    /*
    - void displayInfo() -> Will print out all account information .
    - double deposit() -> One parameter to update balance
    - double withDraw() -> one parameter to update balance
    - boolean logIn() -> userName, password parameter to update isLoggedIn boolean.
     */

    public void displayInfo(){
        //Should i print the information is user is not logged in
        if(isLoggedIn){
            System.out.println("Username: " + userName);
            System.out.println("Password: " + password);
            System.out.println("BankName: " + bankName);
            System.out.println("Balance: " + balance);
        }
    }

    public boolean logIn(String uName, String pass) {
        if (uName.equals(userName) && pass.equals(password)) {
            System.out.println("You have succesufullt loggen in.");
            isLoggedIn = true;
            return isLoggedIn;
        }
        System.out.println("Wrong credentials ");
        isLoggedIn = false;
        return isLoggedIn;

    }
    // When the code encounter a return keyword the rest of the codes in the method are not executed.

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.userName = "test";
        bankAccount.password = "test1";
        // what is the value for isLoggedIn?
        bankAccount.displayInfo();
        // Since isLoggedIn value has not been assigned yet. It will take the default value for boolean which is false.
        // in the display info we have an if statement if isLoggedIn value is true, it will display all the information.
        // if isLoggedIn value is false it won't display anything.
        // The calling of method above won't display anything.

        // To display an information we must log in to our account.
        // call logIn method
        boolean didILogIn = bankAccount.logIn("test","test1");
        System.out.println("Did I login above? " + didILogIn);
        // Since the username and password I provide for login
        // is matching with username and password for the account I will successfully login.
        // and boolean value isLoggedIn will become true.

        // What is the return type of logIn method?
        //

        // Since I logged in above I should be able to display my info?
        bankAccount.displayInfo();


    }

}
