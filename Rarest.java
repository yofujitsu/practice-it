import java.util.*;
import java.lang.*;

public class Rarest {

    public static int rarest(Map<String, Integer> map) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int rarest = Integer.MAX_VALUE;
        int numRarest = Integer.MAX_VALUE;

        for(String key : map.keySet()) {
            int value = map.get(key);

            if(hashmap.containsKey(value)) {
                hashmap.put(value, hashmap.get(value) + 1);
            } else {
                hashmap.put(value, 1);
            }
        }

        for(int key : hashmap.keySet()) {
            int value = hashmap.get(key);

            if(value < numRarest) {
                rarest = key;
                numRarest = value;
            } else if(value == numRarest) {
                rarest = key < rarest ? key : rarest;
            }
        }

        return rarest;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Alyssa",22);
        map1.put("Char",25);
        map1.put("Den",25);
        map1.put("Jeff",20);
        map1.put("Kasey",20);
        map1.put("Kim",20);
        map1.put("Morgan",25);
        map1.put("Ryan",25);
        map1.put("Stef",22);
        System.out.println(rarest(map1));
    }
}
