package Map.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sagar",19);
        map.put("Karan",18);
        map.put("Hrishi",20);
        System.out.println(map);
        System.out.println(map.containsKey("Sagar"));

        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(32);
        set.add(23);
        System.out.println(set);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Sagar",19);
        treeMap.put("Karan",18);
        treeMap.put("Hrishi",20);
        System.out.println(treeMap);

    }                                                                                                           
}
