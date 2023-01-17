import java.util.*;
import java.lang.*;

public class MysteryMap {

    public static void mystery(Map<String, String> map) {
        Map<String, String> result = new TreeMap<String, String>();
        for(String key : map.keySet()) {
            if (key.compareTo(map.get(key)) < 0) result.put(key, map.get(key));
            else result.put(map.get(key), key);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<String, String>();

        //test 1
        map1.put("two", "deux");
        map1.put("five", "cinq");
        map1.put("one", "un");
        map1.put("three", "trois");
        map1.put("four", "quatre");
        mystery(map1);
        map1.clear();

        //test 2
        map1.put("skate", "board");
        map1.put("drive", "car");
        map1.put("program", "computer");
        map1.put("play", "computer");
        mystery(map1);
        map1.clear();

        //test 3
        map1.put("siskel", "ebert");
        map1.put("girl", "boy");
        map1.put("heads", "tails");
        map1.put("ready", "begin");
        map1.put("first", "last");
        map1.put("begin", "end");
        mystery(map1);
        map1.clear();

        //test 4
        map1.put("cotton", "shirt");
        map1.put("tree", "violin");
        map1.put("seed", "tree");
        map1.put("light", "tree");
        map1.put("rain", "cotton");
        mystery(map1);
        map1.clear();

    }
}
