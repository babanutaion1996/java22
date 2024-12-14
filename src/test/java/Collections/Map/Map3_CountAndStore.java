package Collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Map3_CountAndStore {
    public static void main(String[] args) {
        String[] states = {"IL","IL","NY","WI","WA","FL","FL","FL"};
                // Create a logic to count states and store them in a hashMap as in following format.
              // K       ,        V
             // IL,               2
             // NY,               1
             // WI,               1
             // WA,               1
            // FL,                3

        HashMap<String,Integer> counts = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();

        // How could I look at the each element one-by-one in the array?

        for(String state: states){
            if(map.containsKey(state)){
                // Since the map already has the state I can get the existing count.
                int existingCount = map.get(state);
                existingCount++;// increase the existingCount by one
                // I need to update the count value for the state
                map.put(state,existingCount);
            }else{
                map.put(state,1);{

                }
            }

            System.out.println(map);


        }







    }
}
