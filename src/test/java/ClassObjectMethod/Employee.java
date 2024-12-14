package ClassObjectMethod;

public class Employee {
    // By creating our own constructor we could enforce our own logic
    // to create an object
    String name;
    String department;
    int yearsOfExperience;
    String title;
    // this keyword
    // this means the current class, And usually used to call instance variable of the class.
    public Employee(String name, String department,int yearsOfExperience, String title){
    // Java always chooses the closest initialization when calling  a variable with same name.
      this.name = name;// Initializing the instance variable with a value that comes form the parameters.
      this.department = department;
      this.yearsOfExperience = yearsOfExperience;
      this.title = title;

    }


    // No one should be able to create an Employee without a name
    public Employee(String empName,String departmentName, int expirience){
        name = empName;
        department = departmentName;
        yearsOfExperience = expirience;
    }
// An HR should also able to register an employee without years of experience.

    public Employee(String empName,String departmentName){
        name = empName;
        department = departmentName;
    }

    // Let's create a method to display a information of employee if it is not null

    public void displayInfo() {
        // Let's check if the isntance variable are not null
        if (name != null) {
            System.out.println("Name of the employee " + name);
        }
        if (department != null) {
            System.out.println("Department of the employee " + department);
        }
        if (title != null) {
            System.out.println("Title of the employee " + title);
        }
        if (yearsOfExperience != 0) {
            System.out.println("Years of experience " + yearsOfExperience);
        }
    }

    public static void main(String[] args) {

        Employee em1 = new Employee("Dave","IT",3);
        System.out.println(em1.name);
        Employee em2 = new Employee("Mauro","Finance");
        System.out.println("Department of the employee 1 is" + em1.department);
        System.out.println("Department of the employee 2 is" + em2.department);
        Employee em3 = new Employee("Alma","IT",1,"Jr. Dev");
        em1.displayInfo();
        em2.displayInfo();
        em3.displayInfo();
    }
}
