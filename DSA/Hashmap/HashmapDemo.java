package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Sagar",19);
        hm.put("Mayur",20);
        hm.put("Hrishi",19);
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }
        System.out.println("Key: "+hm.get("Sagar"));
    }
}
