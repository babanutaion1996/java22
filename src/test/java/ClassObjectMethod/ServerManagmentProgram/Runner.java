package ClassObjectMethod.ServerManagmentProgram;

public class Runner {
    public static void main(String[] args) {
        ServerManager serverManager = new ServerManager();
        System.out.println(serverManager.listOfServer.size());//0

        Server server1 = new Server("Jenkins","Running","32.170.45.60");

        System.out.println(serverManager.listOfServer.size());//0

        serverManager.addServer(server1);

        System.out.println(serverManager.listOfServer.size());//1

        Server server2 = new Server("Terraform","Pending","48.101.175.128");
        serverManager.addServer(server2);

        Server server3 = new Server("StagingTP","Hybernating","81.96.144.52");
        serverManager.addServer(server3);

        //How could i display all the server information.

        serverManager.displayAllServerInfo();
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");

        // Let's remove the server with name Terraform

     serverManager.removeServer("Terraform");


        System.out.println(serverManager.listOfServer.size());//2
        serverManager.displayAllServerInfo();
    }
}
