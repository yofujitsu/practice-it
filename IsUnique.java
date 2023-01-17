import java.util.*;

public class IsUnique {

    public static boolean isUnique(Map<String, String> map) {
        HashSet<String> set = new HashSet<String>();

        for(String key : map.keySet()) {
            String value = map.get(key);

            if(set.contains(value))
                return false;

            set.add(value);
        }

        return true;
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        //test 1 (true)
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");
        System.out.println(isUnique(map1));
        map1.clear();

        //test 2 (false)
        map1.put("Kendrick", "Perkins");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Reges");
        map1.put("Hal", "Perkins");
        System.out.println(isUnique(map1));
        map1.clear();
    }
}
