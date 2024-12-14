package ClassObjectMethod.ServerManagmentProgram;

import java.util.ArrayList;
import java.util.List;

public class ServerManager {
    // Create a list for storing server objects.
    List<Server> listOfServer = new ArrayList<>();
    // Empty list to store list of servers.

    // Create Add a new server method


    public void addServer(Server server){
        // How could I add this given server to my list of server?
        listOfServer.add(server);

    }
    // Remove an existing server by its name
    // I am expecting a name , so I can remove the server with given name
    public void removeServer(String name){
        // How could i find mathichg server with given name and then remove it?
        // How are we going to find index number of a server with a given name?
        // Go through all the servers, then find a server with matching name then remove that index and stop the loop
        for (int i = 0; i < listOfServer.size(); i++) {
            // How can i compare the name of the server with given name
            Server currentServer = listOfServer.get(i);
            // What is the name of the currentServer?
            if(currentServer.name.equalsIgnoreCase(name)){
                // I find the server with mathiching name
                // What is the index number of currrent server?
                // I need to remove the element at index i
                listOfServer.remove(i);
            }

        }
    }

    //Display the details off all server
    public void displayAllServerInfo(){
        for(Server server : listOfServer){
            server.displayInfo();
        }

    }



}
