package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Computer {

    String color;
    String processor;
    int cpuNumber;
    int screenSize;

    public static void main(String[] args) {
        Map<String, Object> computer = new HashMap<>();
        // Adding elements to the computer map
        computer.put("color","Blue");
        computer.put("processor","Apple Sillicon");
        computer.put("cpuNumber", 8);
        computer.put("screenSize",14);
        System.out.println(computer);

        // Map usually used to store KEY-VALUE pairs. Keys MUST be unique, values could be duplicated.
        // Map object is also not using index numbers. However in mas there is a way to access individual values.
        //Let's say we are wondering processor of the computer.
        System.out.println(computer.get("processor"));

        // get method takes the `key` as a parameter and returns the value for the given key.

        // Let's say the key that you try to access is not in the map
        System.out.println(computer.get("operating system"));
        // When we try to get value for they key that doesn't exist in the map, we get a null value.

        // To remove a key pair set from the map we use a remove method and provide the key so that key and the value
        // for that key could be removed.
        computer.remove("color");
        System.out.println(computer);

        // To learn the number of key-value pairs in the map
        System.out.println(computer.size());//3

        // Let's loop trough the map
        // entrySet() method it will return set of Entry objects.
        // it will return set of key-values pairs.
        // In java a single key-value pair in a map could be represented by a Entry object.

//        Set<Map.Entry<String,Object>> keyValuePairs = computer.entrySet();
        for(Map.Entry<String,Object> keyValuePair: computer.entrySet()){
            System.out.println("Key:" + keyValuePair.getKey());
            System.out.println("Value:" + keyValuePair.getValue());
        }









    }
}
