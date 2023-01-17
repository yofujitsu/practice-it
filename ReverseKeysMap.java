import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;


public class ReverseKeysMap {


    public static HashMap<String, Integer> reverseMaps(HashMap<Integer, String> map1, HashMap<String, Integer> map2) {
        for(int i : map1.keySet()) {
            map2.put(map1.get(i), i);
        }
        return map2;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> mapReversed = new HashMap<String, Integer>();
        map1.put(1,"first");
        map1.put(2, "second");
        map1.put(3, "third");
        map1.put(4, "fourth");
        map1.put(5, "fifth");

        System.out.println(reverseMaps(map1, mapReversed));
    }

}