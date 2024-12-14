package ClassObjectMethod.ServerManagmentProgram;

public class Server {
    String  name;
    String  ipAdress;
    String  status;
    // How do i initialize all the atributes above using a constructor?


    public Server(String name, String status, String ipAdress) {
        this.name = name;
        this.status = status;
        this.ipAdress = ipAdress;
    }

    public void displayInfo(){
        System.out.println("Server Name: " + name );
        System.out.println("Ip Adress: " + ipAdress );
        System.out.println("Status: " + status );
    }
}


