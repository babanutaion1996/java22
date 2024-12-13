import AccessModifiers.Store;

public class TestAccessModifiers {
    // This class is outside the same package of Store class.
    public static void main(String[] args) {
       Store st1 = new Store("St123","Downtown");
      // st1.storeLocation;//AccessModifiers. Store'. Cannot be accessed from outside package

      //  st1.updateSecretCode('test')// -> I cannot call this method because it is package protected.

        st1.displayDetails();// This method ca be called as is has public access modifier.

        // How do you call the static variable or methods?
        // You could use object to call static variables or method, HOWEVER, recommended way to call static variables
        // or methods is to use CLASS NAME

       Store.displayCompanyName();// As the method is public we are able to call here
        // Also method is static method, so we can call this using the calss name.
    }
}
